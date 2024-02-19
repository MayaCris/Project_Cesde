package ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class EjercicioVariable  {
    // Imprimir un formulario  en el que almacene en variables los siguientes datos;
    //CC, nombre, apellido, edad, celular, correo, es Casado, estatura
    //Use la concatenación para crear la leyenda del dato


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su número de identificación ");
        int id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Ingrese su nombre ");
        String nomb = scanner.nextLine();

        System.out.println("Su nombre es " + nomb + " y su identificación es " + id);
        scanner.close();

        //int cedula = 1035456765;
        //String nombre = "Cr";
        //String apellido = "Maya";
        //short age = 40;
        //long celular = 3126457812l;
        //String email = "ejemplo@gmail.com";
        //boolean esCasado = true;

        //System.out.println("Nombre del Usuario: " + nombre + "\n" +
                //"Apellido del Usuario: " + apellido + "\n" +
                //"Edad del Usuario: " + age + "\n" +
                //"Número de celular: " + celular + "\n" +
                //"Correo: " + email + "\n" +
                //"Es casado: " + esCasado );


    }


}



