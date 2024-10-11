package org.example.Modelos;

public abstract class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private double valorCompra;

    public Cliente(String nombre, String apellido, String direccion, String telefono, String correo, double valorCompra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.valorCompra = valorCompra;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void saludar(){
        System.out.println("Hola, soy "+this.nombre+" "+this.apellido);
    }

    public abstract void totalPorPagar();


}
