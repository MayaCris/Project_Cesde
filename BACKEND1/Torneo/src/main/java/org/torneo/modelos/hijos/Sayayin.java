package org.torneo.modelos.hijos;

import org.torneo.modelos.Guerrero;

public class Sayayin extends Guerrero {

    private Integer fase;

    public Sayayin() {
    }

    @Override
    public void saludar() {
        System.out.println("Hola insecto. Soy " + getNombre());
    }

    public Sayayin(String nombre, Integer poderPelea, Integer poderDefensa, Integer vida, Integer fase) {
        super(nombre, poderPelea, poderDefensa, vida);
        this.fase = fase;
    }

    public Integer getFase() {
        return fase;
    }

    public void setFase(Integer fase) {
        this.fase = fase;
    }
}
