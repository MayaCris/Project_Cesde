package apuntesdeclase;

public class whiledecremento {
    public static void main(String[] args) {
        //Haga un acumulador que imprima los numeros pares del 1000 al 0 en rangos de 10 en 10

        int num = 1000;

        while (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num = num - 10;

        }
    }
}