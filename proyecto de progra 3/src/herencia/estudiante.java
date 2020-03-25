package herencia;

public class estudiante extends persona {
    private String carrera;
    public estudiante(String carrera,String nombres,String ap, int edad,String ci){
        super(nombres,ap,edad,ci);

    }
    public void imprimirestudiante(){
        System.out.println(getci());
    }
}
