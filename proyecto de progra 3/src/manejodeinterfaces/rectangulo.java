package manejodeinterfaces;

public class rectangulo implements figura{
    private float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public double arearec(double area){
        area= lado * altura;
        return area;
    }

    private float altura;

    public double area(){
        System.out.printf("el area del rectangulo es: %d",area());
        return 0;
    }
    public double pi(){
        System.out.printf("pi tiene valor de: %d",pi());
        return  0;
    }

}
