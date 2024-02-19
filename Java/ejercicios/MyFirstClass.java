/*
Defina en sus propias palabras que es una variable
R: Es un espacio de memoria que se almacena en la RAM del computador y que guarda cualquier valor que se le asigne
Que entiende por dato
R: Es un valor o cadena de caracteres registrado individualmente
Cual considera que es la diferencia entre dato e información
R:Que la información es la agrupación de varios datos orientados con un sentido lógico y el dato solo corresponde a una pequeña parte de la información
Hasta ahora que entiende por lógica de programación
R:Es la hábilidad transversal en programación para plantear y resolver problemas por medio de código
Que son los datos primitivos en JAVA y cuales son:
R: Son los tipos de datos que acepta JAVA directamente y estos son: int, byte, short, boolean, float, double, char
Que es un String
R: Es un tipo de dato que permite almacenar cadenas de caracteres
*/

package ejercicios;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el producto número 1:  ");
        String product1 = scanner.next();
        System.out.println("Ingrese la cantidad del producto número 1:  ");
        double cantidad1 = scanner.nextDouble();
        System.out.println("Ingrese el precio del producto número 1:  ");
        long precio1 = scanner.nextLong();

        System.out.println("Ingrese el producto número 2:  ");
        String product2 = scanner.next();
        System.out.println("Ingrese la cantidad del producto número 2:  ");
        double cantidad2 = scanner.nextDouble();
        System.out.println("Ingrese el precio del producto número 2:  ");
        long precio2 = scanner.nextLong();





        String product3 = "Brocoli";
        String product4 = "Azucar";
        String product5 = "Cereal";
        String product6 = "Pollo";


        double cantidad3 = 15.4;
        double cantidad4 = 17.1;
        double cantidad5 = 19;
        double cantidad6 = 10;


        long precio3 = 8741L;
        long precio4 = 9875L;
        long precio5 = 9888L;
        long precio6 = 5252L;

        long suma1 = (long) (cantidad1 * precio1);
        long suma2 = (long) (cantidad2 * precio2);
        long suma3 = (long) (cantidad3 * precio3);
        long suma4 = (long) (cantidad4 * precio4);
        long suma5 = (long) (cantidad5 * precio5);
        long suma6 = (long) (cantidad6 * precio6);

        long totalbefore = 50000L;

        long total = (suma1 + suma2 + suma3 + suma4 + suma5 + suma6);




        System.out.println("EMPRESA EL EJERCICIO SAS");
        System.out.println("\n" + "DETALLE DE LOS PRODUCTOS COMPRADOS: ");
        System.out.println("\n" + "El producto " + product1 + " con la cantidad " + cantidad1 + " y el precio " + precio1 + " suma un total de " + suma1);
        System.out.println("El producto " + product2 + " con la cantidad " + cantidad2 + " y el precio " + precio2 + " suma un total de " + suma2);
        System.out.println("El producto " + product3 + " con la cantidad " + cantidad3 + " y el precio " + precio3 + " suma un total de " + suma3);
        System.out.println("El producto " + product4 + " con la cantidad " + cantidad4 + " y el precio " + precio4 + " suma un total de " + suma4);
        System.out.println("El producto " + product5 + " con la cantidad " + cantidad5 + " y el precio " + precio5 + " suma un total de " + suma5);
        System.out.println("El producto " + product6 + " con la cantidad " + cantidad6 + " y el precio " + precio6 + " suma un total de " + suma6);
        System.out.println("\n" + "El total gastado es " + total);


        boolean result = totalbefore > total;
        if (result) {
            System.out.println("El valor de su compra es mayor a la anterior");
        }
        else {
            System.out.println("El valor de su compra es menor a la anterior");
            }
        }

    }



