package PLATZI.MedicalAppointments;

//import static PLATZI.MedicalAppointments.Doctor.*;
import javax.xml.namespace.QName;

import static PLATZI.MedicalAppointments.Ui.UIMenu.*; //Importa los metodos del archivo UIMenu para hacer un llamado directo
//de la función

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Anahí Salgado", "pediatría");
        System.out.println("El nombre del doctor es: " + myDoctor.name + "y su especialidad es: " + myDoctor.speciality);

        Patient patient = new Patient("Alejandra","aleja@gmail.com");



    }

}


