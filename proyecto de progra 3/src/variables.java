public class variables {
    public int edad = 20;
    private String password = "123456pwd";
    public static void main(String[] args) {
        int edad = 20;
        String password ="123456pwd" ;
        String mi ="mi primer programa ";
        String desde ="desde java";
        System.out.println(edad +" "+password);
        System.out.println();

        System.out.printf("al variable edad: %d es un numero",edad);
        System.out.println();
        System.out.printf("%s \n %s ",mi,desde);
        System.out.println();

        int manzanas = 6;
        int personas = 3;
        int sobrante = manzanas / personas;
        System.out.printf("si tengo %d manzanas y %d personas a cada persona le toca a %d manzanas",manzanas,personas,sobrante);


    }
}
