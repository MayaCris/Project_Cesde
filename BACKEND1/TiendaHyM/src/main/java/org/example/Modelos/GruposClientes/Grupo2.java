package org.example.Modelos.GruposClientes;

import org.example.Modelos.Cliente;

public class Grupo2 extends Cliente {
    private double descuento;

    public Grupo2() {
    }


    public Grupo2(String nombre, String apellido, String direccion, String telefono, String correo, double valorCompra, double descuento) {
        super(nombre, apellido, direccion, telefono, correo, valorCompra);
        this.descuento = descuento;
    }

    @Override
    public void totalPorPagar() {
        if (this.getValorCompra() > 500000) {
            double valorDescuento = this.getValorCompra() * this.descuento;
            System.out.println("El valor de la compra es $" + this.getValorCompra());
            System.out.println("y se otorga un descuento de " + (this.descuento * 100) + "%");
            System.out.println("por valor de $" + valorDescuento);
            System.out.println("El valor neto a pagar es $" + (this.getValorCompra() - valorDescuento));
        }else {
            System.out.println("Lo sentimos, no aplica descuento.");
            System.out.println("El total de su compra es de $" + this.getValorCompra());
        }
    }
}
