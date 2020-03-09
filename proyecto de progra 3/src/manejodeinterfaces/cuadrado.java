package manejodeinterfaces;

public class cuadrado implements figura{
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    private int lado;

    public double areacua(int area){
        area = lado * lado;
        return 0;
    }

    public double area(){
        System.out.printf("el area del circulo es: %d",areacua());
        return 0;
    }
}
