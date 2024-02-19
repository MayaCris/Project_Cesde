package apuntesdeclase;

import java.util.Scanner;

public class PracticaWhile {
    public static void main(String[] args) {
        String pwdValid = "contra";
        String userValid = "Andres1";
        int ageValid = 14;
        float heightValid = 1.50f;
        Scanner park = new Scanner(System.in);


        System.out.println("--------------------------------------------");
        System.out.println("-----Bienvenido al parque de atracciones----");
        System.out.println("--------------------------------------------");

        int execute5 = 0;
        while (execute5 == 0) {
            System.out.println("Digite su usuario : ");
            String userName = park.nextLine();
            System.out.println("Digite su contraseña : ");
            String pwdUser = park.nextLine();

            if (userName.equals(userValid) && (pwdUser.equals(pwdValid))) {
                System.out.println("Bienvenido al menu del parque de atracciones " + userName);
                execute5 = 1;
            } else {
                System.out.println("Usuario y/o contraseña incorrecta, por favor digíte nuevamente");
            }
        }


        int execute = 0;
        while (execute == 0) {
            System.out.println("----Menu Principal-------");
            System.out.println("----Digite alguna de las siguientes opciones");
            System.out.println("----1. Validar un usuario");
            System.out.println("----2. Salir");
            int menu = park.nextInt();

            switch (menu) {
                case 1:
                    int execute1 = 0;
                    while (execute1 == 0) {

                        System.out.println("Ingrese la edad del usuario");
                        int ageUser = park.nextInt();
                        System.out.println("Ingrese la estatura del usuario");
                        float heightUser = park.nextFloat();

                        if ((ageUser >= ageValid) || (heightUser >= heightValid)) {
                            System.out.println("El usuario puede ingresar al parque");
                        } else {
                            System.out.println("El usuario no puede ingresar");
                        }
                        int execute2 = 0;

                        while (execute2 == 0) {
                            System.out.println("Deseas ingresar otra persona. Digita 1. Si 2. Salir");
                            int menu1 = park.nextInt();

                            if (menu1 == 1) {
                                break;
                            } else if (menu1 == 2) {
                                execute2 = 1;
                                execute1 = 1;

                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del sistema. Hasta luego");
                    execute = 1;
                    break;
                default:
                    System.out.println("Opción invalida, digite nuevamente");
                    break;

            }
        }
    }
}





