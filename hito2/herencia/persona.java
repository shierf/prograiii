package herencia;

public class persona {
    public String nombre;
    public String apelidos;
    public int edad;
    public String ci;

    public persona(String nombre, String apelidos,int edad,String ci){
        this.nombre = nombre;
        this.apelidos = apelidos;
        this.edad = edad;
        this.ci = ci;
    }
    public void setci(String ci){
        this.ci = ci;
    }
    public String getci(){
        return this.ci;
    }
}
