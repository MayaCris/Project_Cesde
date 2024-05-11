package MedicalAppointments;

//import static MedicalAppointments.Doctor.numDoc;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();

        System.out.println("----------------------------------------");
//        System.out.println("Ingrese el id del Doctor");
//        Integer id = sc.nextInt();
//        sc.nextLine();
        System.out.println("Ingrese el nombre del Doctor");
        String name = sc.nextLine();
        System.out.println("Ingrese la especialidad del Doctor");
        String speciality = sc.nextLine();

        Doctor myDoctor2 = new Doctor(1, name, speciality);
        myDoctor2.showName();
        System.out.println("El ID del doctor es: " + Doctor.id);

        System.out.println("-------------------------------------------");
        System.out.println("Ejemplo de manejo de variable Static declarada en la clase Doctor");
        Doctor.numDoc = 1478; //Asignar valor a la variable, ya que se había inicializado vacía
        System.out.println("El numero del documento del  doctor es: " + Doctor.numDoc); //Imprimir valor


        System.out.println("---------------------------------------");
        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.name = "Anna ";
        myDoctorAnn.showName();
        myDoctorAnn.showId();

        UIMenu.showMenu();
    }



}


