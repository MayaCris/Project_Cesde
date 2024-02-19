package apuntesdeclase;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {


        Scanner employ = new Scanner(System.in);

        //variables
        String user = "c@mail.com";
        String pwd = "contra";
        String tel = "3001234567";
        String userEmail = "";
        String userPwd = "";
        String userTel = "";
        double  salarioMinimo = 1300000;

        //Inicio de sesion

        System.out.println("Bienvenido al ingreso del sistema");
        System.out.println("Ingrese una de las siguientes opciones");
        System.out.println("1. Iniciar sesion con correo");
        System.out.println("2. Iniciar sesion con telefono");
        int option = employ.nextInt();
        employ.nextLine();

        if ( option == 1){
            System.out.println("Ingrese su email: ");
            userEmail = employ.nextLine();
            System.out.println("Ingrese su contraseña: ");
            userPwd = employ.nextLine();
            if (user.equals(userEmail) && (pwd.equals(userPwd))) {
                System.out.println("Bienvenido");
            }else {
                System.out.println("Valide sus credenciales");
            }


        } else if ( option == 2){
            System.out.println("Ingrese su telefono: ");
            userTel = employ.nextLine();
            System.out.println("Ingrese su contraseña: ");
            userPwd = employ.nextLine();
            if (tel.equals(userTel) && (pwd.equals(userPwd))) {
                System.out.println("Bienvenido");
            }else {
                System.out.println("Valide sus credenciales");
            }
        } else {
            System.out.println("Digite una opción valida");
        }

        System.out.println("Ingrese su salario");
        double income = employ.nextDouble();

        if ((income > salarioMinimo) && (income < (salarioMinimo*2))) {
            //income == income * 0.5
            System.out.println("El ahorro según su salario es de: ");
        }

    }
}
