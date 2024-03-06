package ejercicios;

import java.util.Scanner;

public class AreaRectangulo {
    static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args) {

        //Llamar la funciónque calcula el area del rectangulo e imprime el resultado
        //int area = arearectangulo();
        //System.out.println("El area del rectangulo es: " + area );

        //Llamar funcion para capturar el teclado según el tipo de dato:
        //tipoDato();

        //Llamar la función que calcula el radio de una circunferencia
        //double radio = radio();
        //System.out.println("El valor del radio es: " + radio);

        //Llamar la función que valida si el texto tiene @
        validacion();
    }

    public static int  arearectangulo(){
        System.out.println("Ingrese el largo del rectangulo: ");
        int largorect = sc.nextInt();
        System.out.println("Ingrese el ancho del rectangulo: ");
        int anchorect = sc.nextInt();
        int arearect = largorect * anchorect;
        return arearect;
    }

    public static void  tipoDato(){
        System.out.println("Ingrese caracteres tipo texto: ");
        String text = sc.nextLine();
        System.out.println("Ingrese caracteres tipo númerico entero: ");
        int entero = sc.nextInt();
        System.out.println("Ingrese caracteres tipo númerico decimal: ");
        double  decimal = sc.nextDouble();
        System.out.println("La información ingresada fue: " +text + " " + entero + " " + decimal);

    }

    public static double radio(){
        System.out.println("Ingrese la longitud de la circunferencia (cm):  ");
        double longitud = sc.nextDouble();
        double radioValue =  longitud / (2 * Math.PI);
        return radioValue;
    }

    public static void validacion() {
        System.out.println("Ingrese una cadena de texto");
        String text = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < text.length(); i++) {
            char caracter = text.charAt(i);
            if (caracter == '@') {
                encontrado = true;
                break; // Si se encuentra '@', no es necesario seguir buscando
            }
        }

        if (encontrado) {
            System.out.println("Se encontró el caracter '@' en el texto.");
        } else {
            System.out.println("No se encontró el caracter '@' en el texto.");
        }
    }
}
