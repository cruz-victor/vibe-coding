public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new Suma());

        int aEntero = 3;
        int bEntero = 5;
        double resultadoEntero = calculadora.ejecutar(aEntero, bEntero);
        System.out.println("Suma enteros: " + aEntero + " + " + bEntero + " = " + resultadoEntero);

        double aDecimal = 2.5;
        double bDecimal = 4.3;
        double resultadoDecimal = calculadora.ejecutar(aDecimal, bDecimal);
        System.out.println("Suma decimales: " + aDecimal + " + " + bDecimal + " = " + resultadoDecimal);
    }
}


