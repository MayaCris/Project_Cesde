package org.torneo;

import org.torneo.modelos.hijos.Namek;
import org.torneo.modelos.hijos.Sayayin;

public class Main {
    public static void main(String[] args) {
        Sayayin sayayin = new Sayayin("Vegeta",80,60,100,1);
        Namek namek = new Namek("Niel",60, 60,100, "Verde Oscuro");
        System.out.println("Round 1");
        System.out.println("**************************");

        sayayin.saludar();
        namek.saludar();

        sayayin.pelear(sayayin,namek);

    }
}