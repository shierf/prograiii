package vehiculos;

public class trufi extends todosvehicu{
    private String placatrufi ;
    public trufi(String placatrufi,String placa, int nrruedas,int nrasientos){
        super(placa,nrruedas,nrasientos);

    }
    public void imprimirtrufi(){
        System.out.println(getPlaca());
    }
}

