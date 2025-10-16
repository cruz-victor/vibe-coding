# Calculadora Básica en Java

Esta es una calculadora simple implementada en Java que permite realizar operaciones básicas (suma, resta, multiplicación, división y potencia) con dos números enteros o decimales.

## Características

- ✅ Suma de dos números enteros o decimales
- ✅ Resta de dos números enteros o decimales
- ✅ Multiplicación de dos números enteros o decimales
- ✅ División de dos números enteros o decimales
- ✅ Potencia (exponente) de dos números enteros o decimales
- ✅ Validación de división por cero
- ✅ Interfaz de línea de comandos amigable
- ✅ Validación de entrada de datos
- ✅ Manejo de errores

## Requisitos

- Java JDK 8 o superior instalado en tu sistema

## Cómo usar

### Compilación
```bash
javac Calculadora.java
```

### Ejecución
```bash
java Calculadora
```

### Ejemplo de uso
```
=== CALCULADORA BÁSICA ===
Esta calculadora puede sumar, restar, multiplicar, dividir y calcular potencias

Ingresa el primer número: 2
Ingresa el segundo número: 3

Selecciona la operación:
1. Sumar (+)
2. Restar (-)
3. Multiplicar (*)
4. Dividir (/)
5. Potencia (^)
Ingresa tu opción (1, 2, 3, 4 o 5): 5

El resultado de 2.0 ^ 3.0 = 8.0
```

## Estructura del código

- **Clase Calculadora**: Contiene los métodos `sumar()`, `restar()`, `multiplicar()`, `dividir()`, `power()` y el método `main()`
- **Método sumar()**: Recibe dos parámetros double y retorna su suma
- **Método restar()**: Recibe dos parámetros double y retorna su diferencia
- **Método multiplicar()**: Recibe dos parámetros double y retorna su producto
- **Método dividir()**: Recibe dos parámetros double y retorna su cociente (con validación de división por cero)
- **Método power()**: Recibe dos parámetros double (base y exponente) y retorna la potencia
- **Método main()**: Maneja la interacción con el usuario y la entrada/salida de datos

## Funcionalidades implementadas

1. **Entrada de datos**: Solicita al usuario dos números
2. **Selección de operación**: Permite elegir entre suma, resta, multiplicación, división y potencia
3. **Validación**: Maneja errores de entrada con try-catch
4. **Validación de división por cero**: Previene errores matemáticos
5. **Cálculo de potencias**: Utiliza Math.pow() para cálculos precisos
6. **Cálculo**: Realiza la operación seleccionada con los números ingresados
7. **Salida**: Muestra el resultado de forma clara y legible

## Próximas mejoras posibles

- Implementar historial de operaciones
- Crear interfaz gráfica (GUI)
- Agregar soporte para más de dos números
- Implementar operaciones avanzadas (raíz cuadrada, logaritmos)
- Agregar operaciones trigonométricas
