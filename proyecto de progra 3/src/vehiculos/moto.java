package vehiculos;

public class moto extends todosvehicu {
    private String placamoto ;
    public moto(String placamoto,String placa, int nrruedas,int nrasientos){
        super(placa,nrruedas,nrasientos);

    }
    public void imprimirmoto(){
        System.out.println(getPlaca());
    }
}
