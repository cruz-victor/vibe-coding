from __future__ import annotations

from .operacion import Operacion


class Suma(Operacion):
    def calcular(self, a: float, b: float) -> float:
        return a + b


