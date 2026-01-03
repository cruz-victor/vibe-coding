
## 📄 state-model.md

### 🔁 Entidad: Pedido

### Estados

- CREADO
- PAGADO
- CANCELADO
- DESPACHADO
- ENTREGADO

### Transiciones Permitidas

| Origen | Destino | Permitido |
|------|---------|-----------|
| CREADO | PAGADO | ✅ |
| PAGADO | DESPACHADO | ✅ |
| DESPACHADO | ENTREGADO | ✅ |
| PAGADO | CANCELADO | ❌ |

### Estados Finales

- CANCELADO
- ENTREGADO

