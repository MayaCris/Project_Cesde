package apuntesdeclase;

public class OperadorAsignacion {
    public static void main(String[] args) {
        int numIncrement = 1;
        int num2 = numIncrement + numIncrement;
        num2 = num2 + numIncrement;
        num2 += numIncrement;
        System.out.println(num2);

    }
}
