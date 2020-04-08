package procesual;

public class persona extends ciudadano{
    private String etapaCrecimineto;

    public persona() {
        this.etapaCrecimineto = "";
    }

    public void Leer(){
        super.leer();
        System.out.printf("Ingrese etapa de crecimiento: ");
        this.etapaCrecimineto = leer.next();
    }

    public void Mostrar(){
        super.Mostrar();
        System.out.printf("etapa crecimiento : %s %s", this.etapaCrecimineto, "\n");
    }

}
