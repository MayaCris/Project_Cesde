package org.torneo.modelos.hijos;

import org.torneo.modelos.Guerrero;

public class Namek extends Guerrero {
    private String color;

    public Namek() {
    }

    @Override
    public void saludar() {
        System.out.println("Hola competidor. Soy "+ getNombre());
    }

    public Namek(String nombre, Integer poderPelea, Integer poderDefensa, Integer vida, String color) {
        super(nombre, poderPelea, poderDefensa, vida);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
