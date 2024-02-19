package apuntesdeclase;

public class whileCount {
    public static void main(String[] args) {
        //Sume los numeros del 1 al 10

        int num = 0;
        int sum = 0;

        while (num < 10){
            //Suma
            sum = sum + num;
            // acumula
            num++;
            System.out.println(sum);
        }
    }
}
