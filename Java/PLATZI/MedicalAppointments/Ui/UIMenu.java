package PLATZI.MedicalAppointments.Ui;

import java.util.Scanner;

public class UIMenu {
    static Scanner sc = new Scanner(System.in);
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void showMenu(){

        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada: ");

        int response = 0;
        do {
            System.out.println("1. Doctor\n" +
                    "2. Patient\n" +
                    "0. Salir\n");
            response = sc.nextInt();
            sc.nextLine();
            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    System.out.println("Patient");
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");

            }
        }while (response != 0);

    }

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient\n" +
                    "1.Book an appointment\n" +
                    "2. My Appointments\n" +
                    "0. Return\n");

            response = sc.nextInt();
            sc.nextLine();

            switch (response){
                case 1:
                    System.out.println("::Book and appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }

        }while(response != 0);
    }




}
