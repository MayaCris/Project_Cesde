package apuntesdeclase;

import java.util.Scanner;

public class TiposDato {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte temp = 127; //maxima cantidad es 128
        //short distancia = 32767;
        //int peso = 214783647;
        //long distancia2 = 9223372036854775807l;
        //float nota = 4.52f;
        //double precio =1650000.25874236;
        //char arroba = 64;
        //char arroba2 = "@";
        //boolean is = true
        System.out.println("Digite el valor de su salario anual: ");
        var salary = sc.nextDouble();
        sc.nextLine();
        var pension = salary * 0.03;
        var totalsalary = salary - pension;
        System.out.println("Digite su nombre");
        var employeeName = sc.nextLine();
        System.out.println("Nombre----->: " + employeeName +
                         "\nSalario---->: " + totalsalary);


    }
}
