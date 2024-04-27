package PLATZI;

public class Casting {
    public static void main(String[] args) {

        double monthlyDogs = 30.0/12.0;
        System.out.println("Perritos por mes: " + monthlyDogs);

        //Estimacion
        int estimatedDogs = (int)(monthlyDogs);
        System.out.println("Estimated dogs: " + estimatedDogs);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println("Division: " + a/b);
        System.out.println("Division con exactitud: " + (double)a/b);

        double c = (double) a/b;
        System.out.println("Imprimir c: " + c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}

