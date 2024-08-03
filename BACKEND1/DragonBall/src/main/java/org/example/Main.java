package org.example;

import org.example.modelos.Sayayin;
import org.example.modelos.hijos.ClaseAlta;
import org.example.modelos.hijos.ClaseBaja;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dragon Ball Z");

        ClaseAlta claseAlta = new ClaseAlta();
        ClaseBaja claseBaja = new ClaseBaja();

        //Asignandole nombre a cada Sayayin

        claseAlta.setNombre("Vegeta");
        claseBaja.setNombre("Goku");

        claseAlta.saludar();
        claseBaja.saludar();

        claseBaja.pelear();
        claseAlta.pelear();
    }
}