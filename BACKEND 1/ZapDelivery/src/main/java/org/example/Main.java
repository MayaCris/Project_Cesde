package org.example;

import java.time.LocalDate;
import java.util.Scanner;

import org.example.modelos.FechasJava;
import org.example.modelos.Vehiculo;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo();
//
        Scanner sc = new Scanner(System.in);
////        System.out.println("Ingrese la marca del vehiculo: ");
//        System.out.println("Ingrese el kilometraje del vehiculo: ");
//
////        vehiculo1.setMarca(sc.nextLine());
//        vehiculo1.setKilometraje(sc.nextDouble());

//        FechasJava fechasJava = new FechasJava();
//        fechasJava.probarFechas();

        System.out.println("Ingrese el modelo del vehiculo en formato MM-YY: ");
        vehiculo1.setModelo(sc.nextLine());

    }
}


//Completar validaciones y crear una función que arroje un booleano si la validación es correcta o no => ok
//Crear enums para las expresiones regulares => ok

