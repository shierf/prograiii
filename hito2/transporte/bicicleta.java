package transporte;

public class bicicleta implements vehiculo {
    private int nroruedas;


    public void color() {
        System.out.printf("color de bicicleta es :%s",this.getColor());
    }

    public void nroruedas(){
        System.out.printf("nro de ruedas de la bicicleta es: %d",this.getNroruedas());
    }

    public int getNroruedas() {
        return nroruedas;
    }

    public void setNroruedas(int nroruedas) {
        this.nroruedas = nroruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
}
