from __future__ import annotations

from .operacion import Operacion


class Calculadora:
    def __init__(self, operacion: Operacion) -> None:
        self._operacion = operacion

    def ejecutar(self, a: float, b: float) -> float:
        return self._operacion.calcular(a, b)


