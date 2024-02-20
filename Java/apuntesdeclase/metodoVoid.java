package apuntesdeclase;

import java.util.Scanner;

public class metodoVoid {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        print();
        print("Ingrese lo que quiere imprimir en pantalla");
        String valor = sc.next();
        print(valor);
    }

    public static void print() {
        System.out.println("Esto muestra el print");
    }
    public static void print(String valor) {
        System.out.println(valor);
    }
}
