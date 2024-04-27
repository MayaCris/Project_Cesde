package PLATZI;

import java.util.Scanner;

public class Switch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int opc;
//        double  income;
//        double ahorro;
//
//        System.out.println("Digite su salario");
//        income = sc.nextDouble();
//
//        System.out.println("Seleccione una opción \n" +
//                "1. Ahorro del 5%\n" +
//                "2. Ahorro del 7%\n" +
//                "3. Ahorro del 10%\n" +
//                "4. Ahorro voluntario\n");
//
//        opc = sc.nextInt();
//        sc.nextLine();
//
//        switch (opc){
//            case 1:
//                System.out.println("Ahorro del 5%");
//                ahorro = income*0.05;
//                System.out.println("Ahorro " + ahorro );
//                break;
//            case 2:
//                System.out.println("Ahorro del 7%");
//                ahorro = income*0.07;
//                System.out.println("Ahorro " + ahorro );
//                break;
//            case 3:
//                System.out.println("Ahorro del 10%");
//                ahorro = income*0.1;
//                System.out.println("Ahorro " + ahorro );
//                break;
//            case 4:
//                System.out.println("Ahorro voluntario ");
//                System.out.println("Ingrese el porcentaje del ahorro voluntario");
//                double voluntario = sc.nextDouble();
//                ahorro = income * (voluntario/100);
//                System.out.println("Ahorro " + ahorro);
//        }
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el modo de visualización: ");
        String colorModeSelectioned = sc.nextLine();
        switch (colorModeSelectioned) {
            case "Light":
                System.out.println("Seleccionaste el light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste el Night Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste el Dark Mode");
                break;
            default:
                System.out.println("Seleccionaste una opción correcta");
        }
    }

}
