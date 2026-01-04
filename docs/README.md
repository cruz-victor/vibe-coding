# Sistema básico de ventas de productos (POS)

## 1) Funcionalidades mínimas

### Gestión de productos
- **Crear producto**: registrar `name`, `price`, `stock`.
- **Listar productos**: mostrar productos disponibles con precio y stock.
- **Actualizar producto (básico)**:
  - Ajustar `price`.
  - Ajustar `stock` (por reposición o corrección).

### Gestión de órdenes (ventas)
- **Crear orden (Order)**: iniciar una orden en estado `OPEN`.
- **Agregar ítems a la orden (OrderItem)**:
  - Seleccionar `product`.
  - Indicar `quantity`.
  - Calcular `subtotal`.
- **Ver resumen de orden**:
  - Lista de ítems, cantidades, subtotales.
  - `total_amount` de la orden.
- **Registrar pago (Payment)**:
  - Método: `CASH` o `CARD`.
  - Monto pagado.
- **Confirmar pago / cerrar orden**:
  - Cambiar `Order.status` a `PAID`.
  - Guardar `Payment`.
  - **Actualizar stock** de cada `Product` involucrado.
- **Cancelar orden**:
  - Cambiar `Order.status` a `CANCELLED`.
  - No debe afectar stock (si aún no estaba pagada).

---

## 2) Reglas de negocio clave

### Stock
- No se puede agregar un `OrderItem.quantity` mayor que el `Product.stock` disponible.
- El **stock se descuenta solamente cuando la orden pasa a `PAID`**.
- El stock nunca debe quedar en negativo.

### Precios y totales
- `OrderItem.unit_price` debe guardarse al momento de agregar el ítem (precio histórico).
- `OrderItem.subtotal = quantity * unit_price`.
- `Order.total_amount = sum(subtotal de cada OrderItem)`.

### Estados de la orden
- `OPEN`: orden en construcción, se pueden agregar/quitar ítems.
- `PAID`: orden cerrada y pagada, **no se edita**.
- `CANCELLED`: orden anulada, **no se edita**.

### Pagos
- Una `Order` en estado `PAID` debe tener **exactamente un** `Payment` asociado.
- El `Payment.amount` debe ser igual al `Order.total_amount` (para una versión simple).
  - (Opcional futuro) En `CASH`, permitir monto mayor y calcular `change`.

### Consistencia (importante)
- Confirmar una orden (`OPEN` → `PAID`) debe ser una operación atómica:
  - guardar `Order` + `OrderItems` + `Payment`
  - descontar stock
  - si algo falla, no se guarda nada o se revierte.

---

## 3) Modelado de datos (entidades)

> Nota: los tipos y nombres pueden ajustarse a tu lenguaje/DB. Esto es un modelo conceptual.

### Product
- `id` (string/int)
- `name` (string)
- `price` (decimal)
- `stock` (int)
- `created_at` (datetime) *(opcional)*

### Order
- `id` (string/int)
- `created_at` (datetime)
- `status` (enum: `OPEN` | `PAID` | `CANCELLED`)
- `total_amount` (decimal)

Relaciones:
- `Order` **tiene muchos** `OrderItem`
- `Order` **tiene uno** `Payment` (solo cuando está `PAID`)

### OrderItem
- `id` (string/int) *(opcional si tu DB lo requiere)*
- `order_id` (FK → Order)
- `product_id` (FK → Product)
- `quantity` (int)
- `unit_price` (decimal)
- `subtotal` (decimal)

Relaciones:
- `OrderItem` **pertenece a** `Order`
- `OrderItem` **referencia a** `Product`

### Payment
- `id` (string/int)
- `order_id` (FK → Order)
- `method` (enum: `CASH` | `CARD`)
- `amount` (decimal)
- `paid_at` (datetime)

---

## 4) Flujo típico de una orden (Order)

1. **Iniciar orden**
   - Crear `Order` con `status = OPEN`, `created_at = now`, `total_amount = 0`.

2. **Agregar ítems**
   - Seleccionar un `Product`.
   - Ingresar `quantity`.
   - Validar:
     - `quantity > 0`
     - `quantity <= Product.stock`
   - Crear `OrderItem`:
     - `unit_price = Product.price`
     - `subtotal = quantity * unit_price`
   - Recalcular `Order.total_amount`.

3. **Revisar resumen**
   - Mostrar `OrderItems` y `total_amount`.
   - Permitir ajustar ítems (opcional mínimo: eliminar y volver a agregar).

4. **Registrar pago**
   - Seleccionar `Payment.method`: `CASH` o `CARD`.
   - `Payment.amount = Order.total_amount`.
   - `paid_at = now`.

5. **Confirmar / cerrar**
   - Validar que la orden siga `OPEN`.
   - Guardar `Payment`.
   - Cambiar `Order.status` a `PAID`.
   - Descontar stock:
     - Por cada `OrderItem`: `Product.stock -= OrderItem.quantity`
   - Guardar cambios.

6. **Cancelar (alternativa)**
   - Si el cliente no compra:
     - Cambiar `Order.status` a `CANCELLED`.
     - No crear `Payment`.
     - No descontar stock.

---
