package PLATZI;

import java.util.Scanner;

public class DoWhile {
//    public static void main(String[] args) {
//        //El While valida la condicion y si se cumple, ejecuta el proceso
//        //El DoWhile primero ejecuta un bloque de hacer al menos una vez y luego valida la condicilón
//        //
//
//
//        //Valor a validar
//
//        String saludo = "Buenos días ";
//        int personas = 5;
//
//        do{
//            System.out.println(saludo);
//            personas--;
//        }while(personas > 0);
//
//    }

    public static void main(String[] args) {
        int response = 0;

        do {
            System.out.println("_____________________________________________");
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies \n" + "2. Series\n" + "0. Salir\n" );

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response) {
                case 0:
                    System.out.println("Gracias por usar el programa. Hasta luego");
                    break;

                case 1:
                    System.out.println("Movies");
                    break;

                case 2:
                    System.out.println("Series");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        while (response != 0);
        System.out.println("Se terminó el programa");
    }
}
