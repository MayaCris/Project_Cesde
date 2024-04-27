package PLATZI;

public class Functions {
    public static void main(String[] args) {

        double y = 3;

        double areaCirculo = circleArea(y);
        System.out.println("El area del circulo es: " + areaCirculo);

        //Area de una esfera
        //4*PI*r2
        System.out.println("Area de la esfera: " + sphereArea(y));

        //Volumen de una esfera
        //(4/3)*PI*r3
        System.out.println("Area del volumen: " + sphereVolumen(y));

        System.out.println("Conversion de monedas\n");
        System.out.println("Pesos a dolares: " + convertToDolar(200,"MXN"));


    }

    /**
     * Calcula el area de un circulo
     * @param r es el radio de la circunferencia del circulo
     * @return devuelve el valor del area
     */
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Calcula el area de una esfera
     * @param r es el radio de la circunferencia de la esfera
     * @return Devuelve el valor del area de la esfera
     */
    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r,2);
    }

    /**
     * Calcula el volumen de una esfera
     * @param r es el radio de la circunferencia de la esfera
     * @return devuelve el valor del volumen de la esfera
     */
    public static double sphereVolumen(double r) {
        return (4/3) * Math.PI * Math.pow(r,3);
    }


    /**
     * Descripción: Función que especificando la moneda, convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinerro
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double convertToDolar(double quantity, String currency){
        //Valor moneda MXN or COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.059;
                break;
            case "COP":
                quantity = quantity * 0.00026;
                break;
        }
        return quantity;
    }
}
