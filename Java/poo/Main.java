package poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();

        System.out.println("Ingrese el nombre del estudiante");
        estudiante.nombre = sc.nextLine();

        System.out.println("Ingrese el apellido del estudiante");
        estudiante.apellido = sc.nextLine();

        System.out.println("El nombre del estudiante es: " + estudiante.nombre);
        System.out.println("El apellido del estudiante es: " + estudiante.apellido);
    }


}
