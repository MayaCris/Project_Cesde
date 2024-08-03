package org.example.modelos.hijos;

import org.example.modelos.Sayayin;

public class ClaseBaja extends Sayayin {

    private String nombreEsposa;

    public ClaseBaja() {
    }

    @Override
    public void pelear() {
        System.out.println("Soy peleador clase baja. te voy a morder");
    }

    public ClaseBaja(String nombre, String familia, int edad, int poderPelea, String nombreEsposa) {
        super(nombre, familia, edad, poderPelea);
        this.nombreEsposa = nombreEsposa;
    }

    public String getNombreEsposa() {
        return nombreEsposa;
    }

    public void setNombreEsposa(String nombreEsposa) {
        this.nombreEsposa = nombreEsposa;
    }
}
