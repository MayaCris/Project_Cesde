package org.example.Modelos.GruposClientes;

import org.example.Modelos.Cliente;

public class Grupo1 extends Cliente {
    private double descuento;

    public Grupo1() {
    }


    public Grupo1(String nombre, String apellido, String direccion, String telefono, String correo, double valorCompra, double descuento) {
        super(nombre, apellido, direccion, telefono, correo, valorCompra);
        this.descuento = descuento;
    }

    @Override
    public void totalPorPagar() {
        if (this.getValorCompra() > 1000000){
            double valorDescuento = this.getValorCompra()*this.descuento;
            System.out.println("""
                    El valor de la compra es $""" + this.getValorCompra() + """ 
                    \ny se otorga un descuento de\s""" + (this.descuento*100) + """ 
                    %\npor valor de $"""+ valorDescuento + """ 
                    \nEl valor neto a pagar es $""" + (this.getValorCompra()-valorDescuento));
        }else {
            System.out.println("Lo sentimos, no aplica descuento.");
            System.out.println("El total de su compra es de $" + this.getValorCompra());
        }
    }

}
