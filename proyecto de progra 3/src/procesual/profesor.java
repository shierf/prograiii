package procesual;

public class profesor extends persona{
    private int cargaH;
    private String ciudad;
    private int nroMaterias;
    private String[] Materias;

    public profesor(){
        this.cargaH = 0;
        this.ciudad = "";
        this.nroMaterias = 0;

    }

    public void Leer(){
        super.Leer();
        System.out.printf("CargaH: ");
        this.cargaH = leer.nextInt();
        System.out.printf("Ciudad: ");
        this.ciudad = leer.next();
        System.out.printf("Nro de materias: ");
        this.nroMaterias = leer.nextInt();
        this.Materias = new String[this.nroMaterias];

        for(int i=0; i<this.nroMaterias; i++){
            System.out.printf("Ingrese materia: ");
            this.Materias[i] = leer.next();
            System.out.println();
        }
    }

    public void Mostrar(){
        super.Mostrar();
        System.out.printf("cargaH: %d,Ciudad: %s,Nro Destinos: %d %s", this.cargaH,this,ciudad,this.nroMaterias, "\n");
        for(int j=0; j<this.nroMaterias; j++){
            System.out.printf("Materia: %d: %s",(j+1),this.Materias[j]);

        }
    }

    public String verificaCiudad(String[] destinos){
        String respuesta = "No trabajaron en la misma ciudad";

        for(int i=0; i<destinos.length; i++){
            if (this.ciudad.equals(destinos[i])){
                respuesta = "Si trabajaron en esa ciudad";
            }
        }
        return respuesta;
    }

}