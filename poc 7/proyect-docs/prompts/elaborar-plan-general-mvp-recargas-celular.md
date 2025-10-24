Quiero construir una **App de vision por computador para recargar saldo al celular - Primera Iteración (MVP)**.



<!-- Descripción General del Proyecto -->

<project_description>

El objetivo general es crear una aplicación móvil para ayudar a personas de la tercera edad y a personas con discapacidad a recargar saldo en sus teléfonos celulares de forma sencilla, utilizando la cámara del dispositivo para leer automáticamente los códigos (PIN) de las tarjetas de recarga de las operadoras de telefonos. Esta es la primera iteración, enfocándose en la funcionalidad principal.

</project_description>


<!-- Público Objetivo -->

<target_audience>

Nuestro público objetivo principal para este MVP son **personas de la tercera edad (mayores a 60 años) y personas con discacidades fisicas (falta de vision, problemas en las manos, etc)** que necesitan recargar saldo a sus telefonos celuales utilizando tarjetas fisicas de recarga de la operadoras de telefonos. Un público secundario son el **resto de personas** que necesitan una app para recargar saldo facilmente.

</target_audience>


<!-- Tecnologías -->

<technologies>

- **Frontend:** Flutter, Material Design. <!-- Pila VRSS -->

- **Backend y Base de Datos:** Supabase (para autenticación de usuarios, guardar informacion de las tarjetas de recarga, base de datos y potencialmente almacenamiento más adelante). Tensor Flow Lite/PyTorch (para ejecutar modelos previamente entrenados de forma eficiente). ONNX Runtime (para inferencia en dispositivo).

- **Despliegue:** Telefonos moviles con Sistema Operativo Android y iOS para el frontend y Supabase para los servicios de backend.

</technologies>


<!-- Descripción de la Funcionalidad - MVP -->

<functionalities_mvp>

**Roles de Usuario Clave para MVP:**

1.  **Persona de la tercera edad / Persona con discapacidad / Resto de Personas:** Puede registrarse, iniciar sesión, activar la camara, editar el PIN identificado y ver historial de tarjetas recargadas.

**Funcionalidades Principales para esta iteración MVP:**

*   **Autenticación de Usuario:** Registro de persona, inicio de sesión, cierre de sesión. (Posponer la recuperación de contraseña para la siguiente iteración si complica el MVP).

*   **Lectura automatica de PIN de recarga:** Activar la camara del celular y reconocer la operadora y PIN de la tarjeta mediante modelos de vision por computador.

*   **Edicion manual de PIN de recarga:** Las personas pueden ver y editar (en caso de ser neceario) los datos identificados por el modelo de vision por computador.

*   **Sin seguridad avanzada para en este MVP.** <!-- Pospóner explícitamente características -->

</functionalities_mvp>


<!-- Mejores Prácticas de Front-end -->

<frontend_practices>

- **Estilo General:** Diseño moderno, limpio y minimalista. Priorizar una estética de **modo oscuro primero** 🌙, asegurando que sea elegante y fácil de usar para nuestro público objetivo de personas de la tercera edad y con dispacidad.

- **Capacidad de Respuesta:** La aplicación debe ser totalmente responsiva 📱💻, luciendo genial en dispositivos móviles y tabletas. Usar componentes Material Desing para asegurar esto, enfocándose en un enfoque mobile-first para la estructura central.

- **Navegación:** Para el MVP, una barra de navegación oculto con un boton en el lado izquierdo con enlaces como 'Mis tarjetas recargadas', 'Perfil de Usuario', 'Cierre de sesion'.

</frontend_practices>


<!-- API y Estrategia de Despliegue -->

<api_and_deployment>

Alojaremos el frontend en **Dispositivos con Android y iOS** y usaremos **Supabase** para la base de datos y la autenticación.


Escribe un archivo markdown con el **plan de implementación** para este MVP de Vision por Computador. No incluyas ningún ejemplo de código en el plan mismo. Divide el plan de implementación en pasos pequeños y procesables y guárdalo en `./memory-bank/implementation.md`.


**Fundamentalmente, prioriza el plan con pasos para sincronizar e implementar en Android/iOS tan a menudo como sea posible.** Por ejemplo, incluye un paso específicamente para implementar un "Hola Mundo" básico o una estructura mínima de aplicación en producción (Android) justo después de la configuración inicial del proyecto y algunos pasos fundamentales. Después de cada conjunto significativo de características (como autenticación de usuario, luego conceptos básicos de vision por computador), incluye un paso para implementar y declara explícitamente: **"Detente y espera a que implemente y pruebe la aplicación en producción antes de continuar."** <!-- Esto asegura retroalimentación iterativa y reduce el riesgo -->

</api_and_deployment>