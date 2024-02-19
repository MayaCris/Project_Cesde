package entregables;

import java.util.Scanner;

public class imcExample {
    public static void main(String[] args) {
        // Averiguar como se calcula el IMC
        //Hacerlo con switch
        //Hacerlo con elif
        //Tiene que tener primero un inicio de sesion. Si es correcto, que deje validar el IMC
        //Imprimir la interpretacion de cada porcentaje
        //Que tenga una validacion si quiere que el programa lo ejecute con un elif o con switch


        //Variables
        int execute = 0;
        String user = "user@mail.com";
        String pwd = "user";
        String tel = "300";

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("-----Bienvenido al validador de IMC---------");
        System.out.println("--------------------------------------------\n");

        while (execute == 0) {
            System.out.println("---------------Menu principal---------------");
            System.out.println("--------------------------------------------");
            System.out.println("Digite una de las siguientes opçiones");
            System.out.println("1.Ejecutar el validador con Switch");
            System.out.println("2.Ejecutar el validador con Elif");
            int option1 = sc.nextInt();

            if (option1 == 1) {

                System.out.println("Bienvenido al ingreso del sistema");
                System.out.println("Ingrese una de las siguientes opciones");
                System.out.println("1. Iniciar sesion con correo");
                System.out.println("2. Iniciar sesion con telefono\n");

                int option2 = sc.nextInt();

                sc.nextLine();

                switch (option2) {

                    case 1:
                        System.out.println("Ingrese su email: ");
                        String userEmail = sc.nextLine();
                        System.out.println("Ingrese su contraseña:\n");
                        String userPwd = sc.nextLine();
                        if (user.equals(userEmail) && (pwd.equals(userPwd))) {
                            System.out.println("Bienvenido");

                            System.out.println("Digite su peso en kg: \n");
                            float weight = sc.nextFloat();
                            System.out.println("Digite su estatura en metros (#,##): \n");
                            float heigt = sc.nextFloat();

                            int result = (int) (weight / (heigt * heigt));
                            System.out.println("Su IMC es de: " +result );

                            int category = 0;

                            if (result < 18.5) {
                                category = 1;
                            } else if ((result >= 18.5) && (result < 25)) {
                                category = 2;
                            } else if ((result >= 25) && (result < 30)) {
                                category = 3;
                            } else if (result >= 30) {
                                category = 4;
                            }

                            switch (category) {
                                case 1:
                                    System.out.println("Usted tiene bajo peso. Consulte a un profesional de la salud.");
                                    break;
                                case 2:
                                    System.out.println("Usted tiene un peso normal. ¡Bien hecho!");
                                    break;
                                case 3:
                                    System.out.println("Usted tiene sobrepeso. Considere hacer ejercicio regularmente y tener una dieta balanceada.");
                                    break;
                                case 4:
                                    System.out.println("Usted tiene obesidad. Es importante consultar a un profesional de la salud para recibir orientación.");
                                    break;
                                default:
                                    System.out.println("Error en el cálculo del IMC.");
                                    break;
                            }

                            execute = 1;

                        }else {
                            System.out.println("Valide sus credenciales");
                        }
                        break;

                    case 2:
                        System.out.println("Ingrese su telefono:\n");
                        String userTel = sc.nextLine();
                        System.out.println("Ingrese su contraseña:\n");
                        userPwd = sc.nextLine();
                        if (tel.equals(userTel) && (pwd.equals(userPwd))) {
                            System.out.println("Bienvenido");

                            System.out.println("Digite su peso en kg: \n");
                            float weight = sc.nextFloat();
                            System.out.println("Digite su estatura en metros (#,##): \n");
                            float heigt = sc.nextFloat();

                            float result = (weight / (heigt * heigt));
                            System.out.println("Su IMC es de: " +result );

                            int category = 0;

                            if (result < 18.5) {
                                category = 1;
                            } else if ((result >= 18.5) && (result < 25)) {
                                category = 2;
                            } else if ((result >= 25) && (result < 30)) {
                                category = 3;
                            } else if (result >= 30) {
                                category = 4;
                            }

                            switch (category) {
                                case 1:
                                    System.out.println("Usted tiene bajo peso. Consulte a un profesional de la salud.");
                                    break;
                                case 2:
                                    System.out.println("Usted tiene un peso normal. ¡Bien hecho!");
                                    break;
                                case 3:
                                    System.out.println("Usted tiene sobrepeso. Considere hacer ejercicio regularmente y tener una dieta balanceada.");
                                    break;
                                case 4:
                                    System.out.println("Usted tiene obesidad. Es importante consultar a un profesional de la salud para recibir orientación.");
                                    break;
                                default:
                                    System.out.println("Error en el cálculo del IMC.");
                                    break;
                            }

                            execute = 1;

                        }else {
                            System.out.println("Valide sus credenciales");
                        }
                        break;
                    default:
                        System.out.println("Digíte una opción válida");

                }

            } else if (option1 == 2) {

                System.out.println("Bienvenido al ingreso del sistema");
                System.out.println("Ingrese una de las siguientes opciones");
                System.out.println("1. Iniciar sesion con correo");
                System.out.println("2. Iniciar sesion con telefono\n");
                int option3 = sc.nextInt();
                sc.nextLine();

                if ( option3 == 1){
                    System.out.println("Ingrese su email:\n ");
                    String userEmail = sc.nextLine();
                    System.out.println("Ingrese su contraseña: \n");
                    String userPwd = sc.nextLine();
                    if (user.equals(userEmail) && (pwd.equals(userPwd))) {
                        System.out.println("Bienvenido");

                        System.out.println("Digite su peso en kg: \n");
                        float weight = sc.nextFloat();
                        System.out.println("Digite su estatura en metros (#,##): \n");
                        float heigt = sc.nextFloat();

                        float result = (weight / (heigt * heigt));
                        System.out.println("Su IMC es de: " +result );

                        if (result < 18.5) {
                            System.out.println("Usted tiene bajo peso. Consulte a un profesional de la salud.");
                        } else if ((result >= 18.5) && (result < 25)) {
                            System.out.println("Usted tiene un peso normal. ¡Bien hecho!");
                        } else if ((result >= 25) && (result < 30)) {
                            System.out.println("Usted tiene sobrepeso. Considere hacer ejercicio regularmente y tener una dieta balanceada.");
                        } else if (result >= 30) {
                            System.out.println("Usted tiene obesidad. Es importante consultar a un profesional de la salud para recibir orientación.");
                        }

                        execute = 1;
                    }else {
                        System.out.println("Valide sus credenciales");
                    }


                } else if ( option3 == 2){
                    System.out.println("Ingrese su telefono:\n");
                    String userTel = sc.nextLine();
                    System.out.println("Ingrese su contraseña:\n ");
                    String userPwd = sc.nextLine();
                    if (tel.equals(userTel) && (pwd.equals(userPwd))) {
                        System.out.println("Bienvenido");

                        System.out.println("Digite su peso en kg: \n");
                        float weight = sc.nextFloat();
                        System.out.println("Digite su estatura en metros (#,##): \n");
                        float height = sc.nextFloat();

                        float result = (weight / (height * height));
                        System.out.println("Su IMC es de: " +result );

                        if (result < 18.5) {
                            System.out.println("Usted tiene bajo peso. Consulte a un profesional de la salud.");
                        } else if ((result >= 18.5) && (result < 25)) {
                            System.out.println("Usted tiene un peso normal. ¡Bien hecho!");
                        } else if ((result >= 25) && (result < 30)) {
                            System.out.println("Usted tiene sobrepeso. Considere hacer ejercicio regularmente y tener una dieta balanceada.");
                        } else if (result >= 30) {
                            System.out.println("Usted tiene obesidad. Es importante consultar a un profesional de la salud para recibir orientación.");
                        }

                        execute = 1;
                    }else {
                        System.out.println("Valide sus credenciales");
                    }
                } else {
                    System.out.println("Digite una opción valida");
                }

            }

        }

    }
}
