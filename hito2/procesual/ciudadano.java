package procesual;

public class ciudadano implements leerinterface{
    private String primerNombre;
    private String primerApellido;
    private int ciNumber;
    private String ciExt;
    private int edad;

    public ciudadano() {
        this.primerNombre = "";
        this.primerApellido = "";
        this.ciNumber = 0;
        this.ciExt = "";
        this.edad = 0;
    }

    public void leer(){
        System.out.printf("Ingrese Primer nombre: ");
        this.primerNombre = leer.next();
        System.out.printf("Ingrese Primer apellido: ");
        this.primerApellido = leer.next();
        System.out.printf("Ingrese Numero CI: ");
        this.ciNumber = leer.nextInt();
        System.out.printf("Ingrese Extension CI: ");
        this.ciExt = leer.next();
        System.out.printf("Ingrese Edad: ");
        this.edad = leer.nextInt();


    }

    public void Mostrar(){
        System.out.printf("Nombre : %s, Apellido : %s, Numero CI: %d, Extension CI: %s,Edad: %d %s",
                this.primerNombre,this.primerApellido,this.ciNumber,this.ciExt,this.edad, "\n");
    }

}

