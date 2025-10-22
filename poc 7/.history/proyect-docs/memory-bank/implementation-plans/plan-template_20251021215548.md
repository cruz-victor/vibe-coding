# 🧩 Plan de Implementación: [Nombre de la característica]

## 🎯 Objetivo
Describe brevemente qué hace esta característica y su propósito.

> Ejemplo: Permitir que los usuarios inicien sesión con su correo y contraseña.

---

## ⚙️ Pasos de Implementación (ACID)

### 1️⃣ [Configuración]
**Tarea:**  
Ejemplo: Crear formulario de login básico.

**Prueba Humana:**  
Abrir la app y confirmar que el formulario se renderiza correctamente.

---

### 2️⃣ [API]
**Tarea:**  
Implementar el endpoint `/auth/login` en el backend.

**Prueba Humana:**  
Usar Postman para probar el endpoint con credenciales de prueba.

---

### 3️⃣ [Integración]
**Tarea:**  
Conectar el formulario del frontend con la API.

**Prueba Humana:**  
Verificar que el flujo completo de login funcione y devuelva un token JWT.

---

## 🧪 Casos de Prueba / Casos Extremos
- [ ] Error de credenciales inválidas
- [ ] Campos vacíos
- [ ] Problemas de conexión con el servidor

---

## 🧍‍♂️ Pruebas Humanas
Describe los pasos de prueba manual.

> 1. Abrir la app  
> 2. Introducir credenciales de prueba  
> 3. Confirmar respuesta 200 OK y token generado  

---

## 📎 Referencias Relacionadas
- `app-description.md`
- `architecture-decisions.md`
- `change-log.md`
