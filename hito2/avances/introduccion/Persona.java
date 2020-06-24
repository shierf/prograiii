package introduccion;

import java.util.Scanner;

public class Persona
{
    public static void main(String[]args)
    {
//        //para leer cadenas
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
//
//
//        System.out.println("ingrese su edad");
//        while(leer.hasNextInt()){
//            int miEdad2 = leer.nextInt();
//            System.out.println("su edad es: "+ miEdad2);
//            System.out.println("ingrese la edad");;
//        }
//
//        // suma de un blucle
//        int suma = 0;
//
//        System.out.println("ingrese su edad");
//        while(leer.hasNextInt()){
//            int miEdad1 = leer.nextInt();
//            suma = miEdad1 + suma ;
//        }
//        System.out.println("la suma es : " + suma );
//
//
//
//
//        int miedad = 0 ;
//        int contador = 0;
//        System.out.println("ingrese su edad");
//
//        while(leer.hasNextInt()){
//            miedad = leer.nextInt();
//            suma += miedad;
//            contador++;
//
//        }
//        System.out.println("la suma es : " + suma/contador);

//        int numero1 = 21;
//        if(numero1 % 2 == 0){
//            System.out.printf("el numero %d es par",numero1);
//
//        }else{
//            System.out.printf("el numero %d es impar",numero1);
//        }
//
//        String name ="prograiii";
//        if(name.equals("prograv")){
//            System.out.printf("la cadena %s es igual",name);
//        }else{
//            System.out.printf("la cadena %s es distinto",name);
//        }

//        for (int i = 1; i <= 10;i++){
//            System.out.printf("");
//        }



        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el numero");
        while(leer.hasNextInt()){
            int numero1 = leer.nextInt();
            if(numero1 >= 50000){
                System.out.printf("platino",numero1);

            }else if (numero1 < 50000 && numero1 >= 10000){
                System.out.printf("gold",numero1);
            }
            else if (numero1 < 10000 ){
                System.out.printf("silver",numero1);
            }
       }
    }
}
