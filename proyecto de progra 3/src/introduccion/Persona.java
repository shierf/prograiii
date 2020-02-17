package introduccion;

import java.util.Scanner;

public class Persona
{
    public static void main(String[]args)
    {
        //para leer cadenas
//        Scanner leer= new Scanner(System.in);
//        System.out.println("ingrese el nombre");
//        String nINombre = leer.nextLine();
//        System.out.println("ingrese el apellido");
//        String miApellido = leer.nextLine();
//        System.out.printf("su nombre completo es : %s %s" ,nINombre,miApellido); System.out.println();
//
//        System.out.println("ingrese su edad");
//        int miEdad = leer.nextInt();
//        System.out.printf("mi edad es: %d" ,miEdad);

//        Scanner leer= new Scanner(System.in);
//        System.out.println("ingrese su edad");
//        while(leer.hasNextInt()){
//            int miEdad2 = leer.nextInt();
//            System.out.println("su edad es: "+ miEdad2);
//            System.out.println("ingrese la edad");;
//        }

        // suma de un blucle
//        int suma = 0;
//        Scanner leer= new Scanner(System.in);
//        System.out.println("ingrese su edad");
//        while(leer.hasNextInt()){
//            int miEdad1 = leer.nextInt();
//            suma = miEdad1 + suma ;
//        }
//        System.out.println("la suma es : " + suma );



        int suma = 0;
        int miedad = 0 ;
        int contador = 0;
        System.out.println("ingrese su edad");
        Scanner leer= new Scanner(System.in);
        while(leer.hasNextInt()){
            miedad = leer.nextInt();
            suma += miedad;
            contador++;

        }
        System.out.println("la suma es : " + suma/contador);

    }
}
