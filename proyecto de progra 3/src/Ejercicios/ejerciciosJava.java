package Ejercicios;


import java.util.Scanner;

public class ejerciciosJava implements fibonaci{


public int fibonaci(int numero){
    Scanner sc = new Scanner(System.in);
    int fibo1,fibo2,i;
    String resp;
    do{
        System.out.println("fibonaci");
    }while(numero<=1);
    System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");

    fibo1=1;
    fibo2=1;

    System.out.print(fibo1 + " ");
    for(i=2;i<=numero;i++){
        System.out.print(fibo2 + " ");
        fibo2 = fibo1 + fibo2;
        fibo1 = fibo2 - fibo1;
    }

    System.out.println();
    return 0;
}
    public void imprimir(String msg,int value){
        System.out.printf("%s %d %s",msg,value,"\n");
    }
    public void sortArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int maxValue = 0;
            for (int j = 0; j < i; j++) {
                if (array[j + 1] > array[maxValue]) {
                    maxValue = j + 1;
                }
            }
            swap(array, i, maxValue);
            printArray(array);
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d \t", array[i]);
        }
        System.out.println();
    }

    public void swap(int[] array, int a, int b) {
        int value = array[b];
        array[b] = array[a];
        array[a] = value;
    }
    public static void ordenaBurbuja(int ArrayN[]) {
        for (int i = 0; i < ArrayN.length - 1; i++) {
            for (int j = 0; j < ArrayN.length - 1; j++) {
                if (ArrayN[j] > ArrayN[j + 1]) {
                int temp = ArrayN[j + 1];
                ArrayN[j + 1] = ArrayN[j];
                ArrayN[j] = temp;
            }
            }
        }
        mostrarN(ArrayN);
    }

    public static void mostrarN(int ArrayN[]) {
        System.out.println("|-----------------------|");

        for (int i = 0; i < ArrayN.length; i++) { System.out.print(" Elemento " + (i + 1) + " -----> " + ArrayN[i] + "\n");
        }

    }






}


