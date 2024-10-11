package org.example;

import org.example.Modelos.GruposClientes.Grupo1;
import org.example.Modelos.GruposClientes.Grupo2;
import org.example.Modelos.GruposClientes.Grupo3;

public class Main {
    public static void main(String[] args) {
        Grupo3 grupo3 = new Grupo3("Cristian","Maya","Cra45","312444444","mail@mail.com",1000000,0.025);
        grupo3.totalPorPagar();
        System.out.println("");
        Grupo1 grupo1 = new Grupo1("Cristian","Maya","Cra45","312444444","mail@mail.com",900000,0.05);
        grupo1.totalPorPagar();
        System.out.println("");
        Grupo2 grupo2 = new Grupo2("Cristian","Maya","Cra45","312444444","mail@mail.com",1000000,0.1);
        grupo2.totalPorPagar();
    }
}