package ejercicios;

import java.util.Scanner;
public class ExReturn {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println(total());
    }

    public static double total(double precio, double tasaiva) {
        System.out.println("Ingrese el precio del producto o servicio");
        precio = sc.nextDouble();

        System.out.println("Ingrese el porcentaje del IVA en decimal");
        tasaiva = sc.nextDouble();

        double totalConIva = precio + precio * tasaiva;
        return totalConIva;


    }
}
