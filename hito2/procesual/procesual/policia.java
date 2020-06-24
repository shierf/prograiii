package procesual;

public class policia extends persona {
    private String turno;
    private int nroDestinos;
    private String[] destinos;

    public policia() {
        this.turno = "";
        this.nroDestinos = 0;

    }


    public void Leer(){
        super.Leer();
        System.out.printf("Ingrese turno: ");
        this.turno = leer.next();
        System.out.printf("Ingrese nro Destinos: ");
        this.nroDestinos = leer.nextInt();
        this.destinos = new String[this.nroDestinos];

        for(int i=0; i<this.nroDestinos; i++){
            System.out.printf("Ingrese destino: ");
            this.destinos[i] = leer.next();
            System.out.println();
        }
    }

    public void Mostrar(){
        super.Mostrar();
        System.out.printf("Turno: %s,Nro Destinos: %d %s", this.turno,this.nroDestinos, "\n");
        for(int j=0; j<this.nroDestinos; j++){
            System.out.printf("Destino: %d: %s",j,this.destinos[j]);

        }
    }
    public String[] getDestinos(){
        return this.destinos;
    }



}
