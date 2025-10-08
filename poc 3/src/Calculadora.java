public class Calculadora {
    private final Operacion operacion;

    public Calculadora(Operacion operacion) {
        this.operacion = operacion;
    }

    public double ejecutar(double a, double b) {
        return operacion.calcular(a, b);
    }
}


