package calculadora;

public class main {
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        calc.imprimir("la suma es:",calc.suma(5,5));
        calc.imprimir("la suma es:",calc.resta(15,5));
        calc.imprimir("la suma es:",calc.multiplicacion(2,5));
        calc.imprimir("la suma es:",calc.division(10,2));
    }
}
