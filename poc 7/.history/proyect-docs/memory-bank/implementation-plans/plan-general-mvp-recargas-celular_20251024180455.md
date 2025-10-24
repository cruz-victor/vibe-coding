# 📘 Plan de Implementación - MVP de App de Visión por Computador para Recargar Saldo en el Celular

**Objetivo:**  
Desarrollar la primera iteración (MVP) de una aplicación móvil accesible que use visión por computador para leer códigos PIN de tarjetas de recarga y facilitar el proceso de recarga de saldo en teléfonos celulares.  

---

## 🧩 Etapa 0: Configuración Inicial del Proyecto

### 0.1. Preparar el entorno de desarrollo
- Instalar **Flutter SDK** y configurar entornos para **Android** y **iOS**.  
- Verificar la correcta conexión con dispositivos físicos/emuladores.  
- Configurar **Supabase** y crear un proyecto base en su panel de administración.  
- Instalar CLI de Supabase localmente y verificar la conexión.

### 0.2. Estructura inicial del proyecto
- Crear un nuevo proyecto Flutter con el nombre `recarga_vision_app`.  
- Configurar el esquema de carpetas (screens, widgets, services, models, etc.).  
- Implementar **modo oscuro por defecto** y un tema accesible (fuentes grandes, alto contraste).  
- Añadir dependencias iniciales: `flutter_bloc` (o Riverpod), `supabase_flutter`, `camera`, `image_picker`, `google_fonts`.

### 0.3. Despliegue base
- Compilar e instalar una versión “Hola Mundo” mínima en **Android** y **iOS**.  
- Confirmar que la app abre correctamente, muestra una pantalla de bienvenida y funciona en ambos sistemas.

➡️ **Detente y espera a que implemente y pruebe la aplicación en producción antes de continuar.**

---

## 🔐 Etapa 1: Autenticación de Usuario (Supabase)

### 1.1. Conexión con Supabase
- Conectar la app a Supabase usando el cliente oficial de Flutter.  
- Configurar `.env` o variables seguras para almacenar claves API.

### 1.2. Implementar flujo de registro e inicio de sesión
- Crear pantallas:
  - Registro de usuario (correo, contraseña, nombre).  
  - Inicio de sesión.  
  - Cierre de sesión desde un menú lateral.  
- Validar inputs y mostrar errores accesibles.

### 1.3. Estado de autenticación persistente
- Implementar persistencia del usuario autenticado con Supabase Session.  
- Redirigir automáticamente a la pantalla principal si el usuario ya está autenticado.

### 1.4. Despliegue
- Probar en dispositivos reales el flujo de registro e inicio de sesión.  
- Validar conectividad real con Supabase.

➡️ **Detente y espera a que implemente y pruebe la aplicación en producción antes de continuar.**

---

## 📷 Etapa 2: Módulo de Cámara y Lectura Automática de PIN

### 2.1. Configuración de permisos
- Solicitar permisos de cámara en Android (Manifest) y iOS (Info.plist).  
- Implementar una pantalla básica para activar/desactivar la cámara.

### 2.2. Captura de imagen
- Implementar el flujo para capturar o enfocar la tarjeta con el PIN visible.  
- Preprocesar imagen (recorte, rotación, mejora de contraste).

### 2.3. Integrar modelo de visión por computador
- Entrenar o seleccionar un modelo OCR ligero (TensorFlow Lite / ONNX Runtime).  
- Convertir el modelo a formato compatible (tflite o onnx).  
- Integrar el modelo localmente y realizar inferencia en dispositivo.  
- Mostrar resultados del PIN reconocido y operadora detectada.

### 2.4. Evaluación del reconocimiento
- Permitir al usuario revisar el PIN detectado.  
- Si el modelo falla o hay dudas, permitir editar manualmente.

### 2.5. Despliegue
- Subir versión de prueba con cámara y OCR integrados.  
- Probar en múltiples dispositivos y entornos de iluminación.

➡️ **Detente y espera a que implemente y pruebe la aplicación en producción antes de continuar.**

---

## ✍️ Etapa 3: Edición Manual y Confirmación de Recarga

### 3.1. Interfaz de edición
- Crear un formulario accesible donde el usuario pueda ver el PIN reconocido.  
- Permitir editar los dígitos con teclado grande y botones espaciados.  
- Agregar validaciones básicas (ej. longitud del PIN esperada).

### 3.2. Confirmación y guardado
- Al confirmar, guardar en la base de datos (Supabase) el registro de la tarjeta:
  - Fecha de lectura.  
  - Operadora detectada.  
  - PIN (en texto plano o cifrado simple en esta etapa).  

### 3.3. Pantalla de historial
- Mostrar una lista simple con las tarjetas recargadas.  
- Permitir ver detalles y volver a intentar la recarga si se desea.

### 3.4. Despliegue
- Publicar versión con flujo completo (cámara → edición → confirmación → historial).  
- Validar persistencia en Supabase y recuperación de datos.

➡️ **Detente y espera a que implemente y pruebe la aplicación en producción antes de continuar.**

---

## 🧠 Etapa 4: Accesibilidad y Optimización UX/UI

### 4.1. Accesibilidad visual y táctil
- Implementar fuentes más grandes, alto contraste, y botones grandes.  
- Agregar soporte de lector de pantalla (TalkBack / VoiceOver).  
- Añadir vibración y sonidos de confirmación para accesibilidad táctil.

### 4.2. Navegación simplificada
- Barra lateral con secciones:
  - Mis tarjetas recargadas.  
  - Perfil de usuario.  
  - Cerrar sesión.  

### 4.3. Despliegue
- Subir versión accesible y probar con usuarios objetivo.  
- Validar que las mejoras de accesibilidad no afecten rendimiento.

➡️ **Detente y espera a que implemente y pruebe la aplicación en producción antes de continuar.**

---

## ☁️ Etapa 5: Preparación para Iteración 2

### 5.1. Documentar resultados del MVP
- Registrar feedback de usuarios.  
- Analizar rendimiento del OCR.  
- Identificar mejoras para:
  - Recuperación de contraseña.  
  - Validación de seguridad.  
  - Envío automático del PIN a operadora.

### 5.2. Preparar ambiente para desarrollo continuo
- Configurar CI/CD básico (ej. GitHub Actions + Supabase).  
- Establecer rutina de despliegues periódicos en Android/iOS.

---

## 🚀 Resultado Esperado

Una aplicación móvil funcional, accesible y probada en producción con las siguientes capacidades:
- Registro e inicio de sesión mediante Supabase.  
- Captura y lectura automática del PIN de una tarjeta física.  
- Edición manual y confirmación del PIN.  
- Historial persistente de recargas.  
- Interfaz accesible y amigable para personas mayores o con discapacidad.

---

📍**Archivo:** `./memory-bank/implementation.md`
