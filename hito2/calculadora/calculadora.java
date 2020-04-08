package calculadora;

public class calculadora implements suma,resta,multiplicacion,division {
public int suma(int a,int b){

    return a+b;
}
    public int resta(int a,int b){
        return a-b;
    }
    public int multiplicacion(int a,int b){
        return a*b;
    }
    public void imprimir(String msg,int value){
        System.out.printf("%s %d %s",msg,value,"\n");
    }
    public int division(int a ,int b){
        return a/b;
    }


}
