package org.example.modelos.hijos;

import org.example.modelos.Sayayin;

public class ClaseAlta extends Sayayin {

    private String estacionEntrenamiento;

    public ClaseAlta() {
    }

    @Override
    public void pelear() {
        System.out.println("Analizo al enemigo y ataco su punto debil");
    }

    public ClaseAlta(String nombre, String familia, int edad, int poderPelea, String estacionEntrenamiento) {
        super(nombre, familia, edad, poderPelea);
        this.estacionEntrenamiento = estacionEntrenamiento;
    }

    public String getEstacionEntrenamiento() {
        return estacionEntrenamiento;
    }

    public void setEstacionEntrenamiento(String estacionEntrenamiento) {
        this.estacionEntrenamiento = estacionEntrenamiento;
    }

}
