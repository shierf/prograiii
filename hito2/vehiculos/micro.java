package vehiculos;

public class micro extends todosvehicu {
    private String placamicro ;
    public micro(String placamicro,String placa, int nrruedas,int nrasientos){
        super(placa,nrruedas,nrasientos);

    }
    public void imprimirvehiculo(){
        System.out.println(getPlaca());
    }
}
