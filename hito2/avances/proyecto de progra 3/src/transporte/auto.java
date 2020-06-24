package transporte;

public class auto implements vehiculo {
    private int nroruedas;
        private String color;
        public void nroruedas(){
            System.out.printf("nro de ruedas auto: %d",this.getNroruedas());
        }
        public void color(){
            System.out.printf("color del auto : %s",this.getColor());
        }

        public void setnroruedas(int nroruedas){
            this.nroruedas = nroruedas;
        }

    public int getNroruedas() {
        return this.nroruedas;
    }
    public void setColor(String color){
            this.color = color;
    }
    public String getColor(){
            return this.color;
    }
}
