package org.example.modelos;

public abstract class Sayayin {

    private String nombre;
    private String familia;
    private int edad;
    private int poderPelea;

    public Sayayin() {
    }

    public Sayayin(String nombre, String familia, int edad, int poderPelea) {
        this.nombre = nombre;
        this.familia = familia;
        this.edad = edad;
        this.poderPelea = poderPelea;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public int getEdad() {
        return edad;
    }

    public int getPoderPelea() {
        return poderPelea;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPoderPelea(int poderPelea) {
        this.poderPelea = poderPelea;
    }

    public void saludar(){
        System.out.println("Hola, mi nombre es: " + this.nombre);
    }

    public abstract void pelear();

}

