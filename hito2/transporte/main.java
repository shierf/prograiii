package transporte;

public class main {
    public static void main(String[] args) {
        auto auto = new auto();
        auto.setColor("blanco");
        auto.setnroruedas(4);
        auto.nroruedas();
        auto.color();

        bicicleta bicicleta = new bicicleta();
        bicicleta.setColor("azul");
        bicicleta.setNroruedas(2);
        bicicleta.nroruedas();
        bicicleta.color();
    }
}
