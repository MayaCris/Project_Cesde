package apuntesdeclase;

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

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r) {
        return (4/3) * Math.PI * Math.pow(r,3);
    }

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
