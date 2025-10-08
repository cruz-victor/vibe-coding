from __future__ import annotations

from abc import ABC, abstractmethod


class Operacion(ABC):
    @abstractmethod
    def calcular(self, a: float, b: float) -> float:
        """Calcula el resultado de aplicar la operación a dos números."""
        raise NotImplementedError


