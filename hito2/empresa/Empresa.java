package empresa;

public class Empresa {
    private String nombre;
    private Area[]area;

    public Empresa(String nombre1,Area[]area){
        this.nombre = nombre1;
        this.area = area;
    }
    public void setempresa(Area[]area){
        this.area = area;

    }
    public Area[] getempresa(){
        return this.area;

    }
    public void Imprimirempresa(){
        System.out.println("nombre de empresa:"+this.nombre);
        for (int i=0;i<this.area.length;i++){
            this.area[i].Imprimir();
        }
    }
}
