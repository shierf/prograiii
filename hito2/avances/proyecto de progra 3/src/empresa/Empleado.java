package empresa;

public class Empleado {
    private String nombre;
    private String ci;
    private int edad;

    public Empleado(String nombre, String ci, int edad){
        this.nombre = nombre;
        this.ci = ci;
        this.edad = edad;


    }
    public void setnombre(String newname){
        this.nombre = newname;

    }
    public String gettnombre(){
        return this.nombre;
    }
    public void imprimir(){
        System.out.println("nombre empleado : " + this.nombre);
        System.out.println("ci empleado : " + this.ci);
        System.out.println("edad empleado : " + this.edad);

    }
}
