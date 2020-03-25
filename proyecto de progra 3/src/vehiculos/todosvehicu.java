package vehiculos;

public class todosvehicu {
    public String placa;
    public int nrruedas;
    public int nrasientos;


    public todosvehicu(String placa, int nrruedas,int nrasientos){
        this.placa = placa;
        this.nrruedas =nrruedas ;
        this.nrasientos = nrasientos;

    }
    public void setplaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return this.placa;
    }
}
