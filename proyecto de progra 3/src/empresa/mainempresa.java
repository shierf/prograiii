package empresa;

import java.util.Scanner;

public class mainempresa {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese numero empleados");
        int n= leer.nextInt();
        Empleado [] empleadosrrhh = new Empleado[n];
        for (int i =0; i<n; i++){
            System.out.println("ingrese nombre empleados");
            String nombre= leer.next();
            System.out.println("ingrese ci empleados");
            String ci= leer.next();
            System.out.println("ingrese edad empleados");
            int edad= leer.nextInt();
            Empleado emp1 = new Empleado(nombre,ci,edad);
            empleadosrrhh[i] = emp1;

        }
        Area area1 = new Area("rrhh",empleadosrrhh);
        Area[] areas = new Area[1];

        areas[0] = area1;

        Empresa empresa1 = new Empresa("pil" ,areas);
        empresa1.Imprimirempresa();


    }

}
