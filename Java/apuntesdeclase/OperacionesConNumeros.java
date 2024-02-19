package apuntesdeclase;

public class OperacionesConNumeros {
    public static void main(String[] args) {
        byte edadMaria = 25;

        byte edadAbuela = 100;

        byte edadHermano = 35;

        short sumaEdades = (short) (edadMaria + edadAbuela + edadHermano);
        System.out.println("la suma de las edades es: " + sumaEdades);

    }
}
