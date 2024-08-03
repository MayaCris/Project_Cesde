package org.example.modelos;

public class Sayayin {

    private String nombre;
    private String familia;
    private int edad;
    private int poderPele;

    public Sayayin() {
    }

    public Sayayin(String nombre, String familia, int edad, int poderPele) {
        this.nombre = nombre;
        this.familia = familia;
        this.edad = edad;
        this.poderPele = poderPele;
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

    public int getPoderPele() {
        return poderPele;
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

    public void setPoderPele(int poderPele) {
        this.poderPele = poderPele;
    }

    public void saludar(){
        System.out.println("Hola, mi nombre es: " + this.nombre);
    }
}

