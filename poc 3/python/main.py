from __future__ import annotations

from .calculadora import Calculadora
from .suma import Suma


def main() -> None:
    calculadora = Calculadora(Suma())

    a_entero = 3
    b_entero = 5
    resultado_entero = calculadora.ejecutar(a_entero, b_entero)
    print(f"Suma enteros: {a_entero} + {b_entero} = {resultado_entero}")

    a_decimal = 2.5
    b_decimal = 4.3
    resultado_decimal = calculadora.ejecutar(a_decimal, b_decimal)
    print(f"Suma decimales: {a_decimal} + {b_decimal} = {resultado_decimal}")


if __name__ == "__main__":
    main()


