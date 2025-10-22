# 🧩 Plan de Implementación: Registrar Producto

## 🎯 Objetivo
Permitir registrar nuevos productos con nombre, precio y categoría.

---

## ⚙️ Pasos de Implementación (ACID)

### 1️⃣ [Backend] Endpoint de Registro
**Tarea:**  
Crear endpoint `POST /api/productos` en el módulo de productos.

**Prueba Humana:**  
Usar Postman → enviar body `{ nombre, precio, categoria }` → verificar respuesta `201 Created`.

---

### 2️⃣ [Frontend] Formulario de Registro
**Tarea:**  
Crear vista `ProductForm` con campos: nombre, precio, categoría y botón “Guardar”.

**Prueba Humana:**  
Verificar que el formulario se renderiza correctamente.

---

### 3️⃣ [Integración] Conectar API + UI
**Tarea:**  
Enviar datos del formulario al endpoint y manejar respuesta.

**Prueba Humana:**  
Registrar producto desde el navegador → revisar base de datos.

---

### 4️⃣ [Validaciones]
**Tarea:**  
Agregar validaciones de campos requeridos en backend y frontend.

**Prueba Humana:**  
Probar campos vacíos → verificar mensajes de error.

---

## 🧪 Casos de Prueba
- [ ] Crear producto válido → `201`.
- [ ] Nombre vacío → error `400`.
- [ ] Duplicado → error `409`.

---

## 📎 Referencias
- Historia de usuario: `docs/user-stories.md#registrar-producto`
- Caso de uso: `docs/casos-uso/registrar-producto.md`
- Arquitectura: `docs/architecture-overview.md#productos`
