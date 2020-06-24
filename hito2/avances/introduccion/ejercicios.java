package introduccion;

import java.util.Scanner;

public class ejercicios {
    public Scanner leer;

    public ejercicios(){
        leer = new Scanner(System.in);
    }
    public void seri1(int n){
        for(int i = 0; i < n;i++){
            System.out.println(i);
        }
    }
    public void compara2cadenas(String cad1,String cad2){
        if(cad1.equals(cad2)){
            System.out.printf("cadenas iguales");
        }else{
            System.out.printf("cadenas distintas");
        }
    }
    public void serie2(int n){
        for(int i = 0; i < n;i++){
            if(i%2 ==0){
                System.out.printf("%d",i+2);;
            }
            else{
                System.out.printf("%d",i);
            }
        }
    }

}

