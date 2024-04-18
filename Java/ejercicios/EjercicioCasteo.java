package ejercicios;

public class EjercicioCasteo {
    public static void main(String[] args){
//        short salario1 = 20000;
//        short salario2 = 10000;
//        short salario3 = 10000;
//        int sumaSalario = (int) (salario1 + salario2 + salario3);
//        if (sumaSalario > 50000) {
//            System.out.println("La suma de los salarios es: " + sumaSalario);
//        } else {
//            System.out.println("Su salario es muy bajo");
//        }


//Ejercicio casteo Platzi
        char c = 'z';
        System.out.println("Variable a castear: " + c);
        int d1 = c;
        System.out.println("Casteo de char a int: " + d1);

        int i = 250;
        System.out.println("\nVariable a castear: " + i);
        long j = i;
        System.out.println("Casteo de int a long: " + j);

        short k = (short) j;
        System.out.println("Casteo de long a short: " + k);

        double d = 301.067;
        System.out.println("\nVariable a castear: " + d);
        long e = (long) d;
        System.out.println("Casteo de double a long: " + e);

        int i4 = (int) (100 + (float) 5000.66);
        System.out.println("\nVariable a castear: " + i4);
        float i5 = (float) i4;
        System.out.println("Casteo de int a float: " + i5);

    }





}




