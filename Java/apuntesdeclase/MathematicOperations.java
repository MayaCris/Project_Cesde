package apuntesdeclase;

public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.ceil(x)); //Redondeo hacia arriba
        System.out.println(Math.floor(x)); //Redondeo hacia abajo

        //Devuelve un numero elevado a otro numero
        System.out.println("La potencia de x elevado en Y es: " + Math.pow(x, y));

        //Devuelve el valor mayor entre dos valores
        System.out.println("El valor mayor es " + Math.max(x,y));

        //Devuelve la raíz cuadrada
        System.out.println("raíz cuadrada" + Math.sqrt(y));

        //Area de un circulo
        //Pi *r2
        System.out.println("Area de un circulo" + Math.PI * Math.pow(y,2));

        //Area de una esfera
        //4*PI*r2
        System.out.println("Area de una esfera es: " + 4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        //(4/3)*PI*r3

        System.out.println("Volumen de una esfera es: " + (4/3)*Math.PI*Math.pow(y,3));

    }
}
