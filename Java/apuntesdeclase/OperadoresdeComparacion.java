package apuntesdeclase;

public class OperadoresdeComparacion {
    public static void main(String[] args) {
        float estatura1 = 1.76f;
        float estatura2 = 1.80f;

        boolean whoIsTall = estatura1 > estatura2;
        System.out.println("El num1 es mayor que num2: " + whoIsTall);

        boolean whoIsShort = estatura1 < estatura2;
        System.out.println("El num1 es menor al num2: " + whoIsShort);

        boolean isDiferent = estatura1 != estatura2;
        System.out.println("El num1 es diferente del num2: " + isDiferent);
    }
}
