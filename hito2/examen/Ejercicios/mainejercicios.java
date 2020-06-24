package Ejercicios;
import java.util.Scanner;


public class mainejercicios {
    public static void main(String[] args) {
        int a;


        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1.fibonacci");
            System.out.println("2.metodo ordenamiento");
            System.out.println("3.metodo de la burbuja 2");
            System.out.println("4.contador de cadenas");
            a=s.nextInt();
        }while( a > 4);
        switch (a) {
            case 1:
                ejerciciosJava ejercicios = new ejerciciosJava();
                System.out.println("fibonaci");
                ejercicios.imprimir("", ejercicios.fibonaci(5));
                break;
            case 2:
                System.out.println("metodo de seleccion");
                ejerciciosJava selectionSort = new ejerciciosJava();
                int[] array = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};
                selectionSort.printArray(array);
                selectionSort.sortArray(array);
                selectionSort.printArray(array);
                break;
            case 3:
                System.out.println("metodo burbuja");
                ejerciciosJava burbuja = new ejerciciosJava();
                int nn;
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca longitud del array: ");
                nn = sc.nextInt();
                int ArrayN[] = new int[nn];
                for (int i = 0; i < ArrayN.length; i++) {
                    System.out.println("Introduzca número para el elemento " + (i + 1) + ": ");
                    ArrayN[i] = sc.nextInt();
                }

                System.out.println("¿Desea ordenar los números? S/N");
                Scanner sc2 = new Scanner(System.in);
                String res = sc2.nextLine();
                if (res.equalsIgnoreCase("S")) {
                    System.out.println("");
                    burbuja.ordenaBurbuja(ArrayN);
                }
                break;
            case 4:{


                break;
            }
            default:
                System.out.println("ingrese una opcion correcta");
        }
    }
}
