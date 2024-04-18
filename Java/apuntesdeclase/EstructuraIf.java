package apuntesdeclase;

import java.util.Scanner;

//public class EstructuraIf {
    //public static void main(String[] args) {
        // Laura quiere montar en la atracción, la montaña de la muerte, ella tiene 12 años
        // y mide 1.51 metros. El parque exige una edad minima de 14 años
        //Laura puede usar la atracción?
        //Cree una funcionalidad que permita validar a cualquier usuario del parque


        //int ageValid = 14;
        //float statureValid = 1.50f;

        //Scanner park2 = new Scanner(System.in);

        //System.out.println("Ingrese el nombre del usuario: ");
        //String user = park2.nextLine();
        //System.out.println("Ingrese la edad del usuario: ");
        //int ageUser = park2.nextInt();
        //System.out.println("Ingrese la estatura: ");
        //float stature = park2.nextFloat();

        //if ((ageUser >= ageValid) || (stature >= statureValid ))
            //{System.out.println("El usuario " + user + " puede ingresar");}
            //else {
            //System.out.println("El usuario " + user + " no puede ingresar");
        //}
    //}

//}


public class EstructuraIf {
//    public static void main(String[] args) {
//        //Inicio de sesión del usuario
//        //Si es verdadero, "Bienvenido + usuario"
//        //Si es falso, "Valide sus credenciales"
//
//
//        String pwdValid = "contra";
//        String userValid = "Andres";
//        String telephone = "3001234567";
//        int ageValid = 14;
//        float heightValid = 1.50f;
//
//        Scanner park = new Scanner(System.in);
//
//        System.out.println("Ingrese el nombre del usuario: ");
//        String userName = park.nextLine();
//        System.out.println("Ingrese la contraseña : ");
//        String pwdUser = park.nextLine();
//
//
//        if (userName.equals(userValid) && pwdUser.equals(pwdValid)) {
//            System.out.println("Bienvenido " + userName + ", puedes ingresar");
//            System.out.println(userName + " por favor ingrese su edad: ");
//            int ageUser = park.nextInt();
//            System.out.println("Ingrese la estatura: ");
//            float height = park.nextFloat();
//
//            if ((ageUser >= ageValid) || (height >= heightValid)) {
//                System.out.println("El usuario " + userName + " puede ingresar");
//            } else {
//                System.out.println(userName + " por favor valide sus credenciales ");
//            }
//        }
//        else {
//            System.out.println("El usuario " + userName + " no puede ingresar");
//        }
//
//    }

    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int filesended = 3;

        if (isBluetoothEnabled) {
            //Send File
            filesended++;
            System.out.println("Archivo enviado");
            System.out.println("La cantidad de archivos enviados es: " + filesended);
        } else {
            filesended--;
            System.out.println("Por favor encienda el Bluetooth para iniciar la transferencia");
            System.out.println("La cantidad de archivos enviados es: " + filesended);
        }
    }

}