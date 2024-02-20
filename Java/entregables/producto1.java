package entregables;

//1. Puede ser una funcionalidad de una aplicación financiera que tenga
// un registro/inicio,
// que guarde en un array datos
// Que realice operaciones y validaciones (if, elseif)
// use al menos, una validación, switch, while, for o forech

//2.Documentar el código para que sea facil de entender por otra persona y exponer el poryecto de otro compañero

//Librerías
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class producto1 {


    static Scanner sc = new Scanner(System.in); //Escaner para realizar inputs con el teclado
    private static Map<String, User> Users = new HashMap<>(); //Diccionario para almacenar los usuarios
    private static Map<Integer, String> transactions = new HashMap<>(); // Diccionario para almacenar las transacciones
    private  static Random random = new Random(); //Clase que permite crear numeros aleatorios

    //Variables estaticas
    private static User currentUser; // Usuario actual que ha iniciado sesión
    static float balance = 0; //Saldo del usuario


    public static void main(String[] args) {

        //Mensaje de bienvenida
        System.out.println("-------------------------------");
        System.out.println("Bienvenido al Banco Tu-Progreso SAS");
        System.out.println("Donde tu dinero está más que seguro");
        System.out.println("-------------------------------\n");

        //Muestra el menu principal
        mainmenu();
        int option1 = sc.nextInt();

        //While para ejecutar el menu principal y cada opción tiene su función que se encuentran más abajo
        while (option1 != 0) {
            switch (option1) {
                case 1:
                    registeruser();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    printUser();
                    break;
                case 4:
                    System.out.println("Saliendo del programa. Hasta pronto");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ingrese una opción valida");
            }
            //Muestra de nuevo el menu
            mainmenu();
            option1 = sc.nextInt();
        }
        sc.close(); //Limpia el escaner

    }

    //Función que muestra el menu principal
    private static void mainmenu() {
        System.out.println("Ingrese una de las siguientes opciones \n" +
                "1. Registrarse\n" +
                "2. Iniciar sesión \n" +
                "3. Imprimir usuarios \n" +
                "4. Salir ");
    }



    //Función para registrar un usuario nuevo
    private static void registeruser() {
        sc.nextLine();
        System.out.println("Ingrese su nombre completo: ");
        String name = sc.nextLine();

        System.out.println("Ingrese su fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate birthdate = LocalDate.parse(sc.nextLine());

        //Calcular la edad
        LocalDate nowDate = LocalDate.now(); //trae la fecha actual
        Period periodo = Period.between(birthdate, nowDate); //con la clase Period se puede hallar la edad del usuario calculando la diferencia entre las dos fechas
        int age = periodo.getYears(); //Almacenamos la edad en años con el .getYears en la variable age

        //Validamos que el usuario sea mayor de edad, de lo contrario, lo lleva al menu principal
        if (age < 18) {
            System.out.println("Lo sentimos, debes tener al menos 18 años para registrarte en este banco.");
            return;
        }
        //Se solicita el correo del usuario
        System.out.println("Ingrese su correo electrónico: ");
        String email = sc.nextLine();
        //Se solicita la contraseña del usuario
        System.out.println("Ingrese su contraseña: ");
        String password = sc.nextLine();
        Float balance = 0f;

        //Guarda la informacion del nuevo usuario en newUser
        User newUser = new User(name, email, birthdate, password, balance);

        //Agregar el email del usuario al diccionario
        Users.put(email, newUser);

        System.out.println("Bienvenido, " + newUser.name + ", se ha registrado correctamente");

    }
    //Función del inicio de sesión
    private static void login() {
        sc.nextLine();
        System.out.println("Bienvenido al inicio de sesión");
        System.out.println("------------------------------");
        System.out.println("Ingrese su correo electrónico: ");
        String email = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String password = sc.nextLine();

        //Validar que el correo si esté registrado
        if (Users.containsKey(email)) {
            User user = Users.get(email);
            // Validar que la contraseña coincida
            if (user.password.equals(password)) {
                // Establecer el usuario actual que ha iniciado sesión
                currentUser = user;
                System.out.println("Inicio de sesión exitoso. Bienvenido " + user.name);
                //Mostrar el menu secundario
                secondmenu();
            } else {
                System.out.println("Contraseña incorrecta, Por favor intetelo de nuevo.");
            }
        } else {
            System.out.println("Correo electronico no registrado. Por favor registrese");
        }

    }

    public static void printUser() {
        //Recorrer el diccionario Users con el for para imprimir el metodo "printinfo"que imprime la info de cada usuario registrado en el diccionario
        for (Map.Entry<String, User> entry : Users.entrySet()) {
            System.out.println(entry.getValue().printinfo());
            System.out.println();
        }
    }

    public static class User { //Se crea la clase User para guardar la información del usuario
        private static String name;
        private static String email;
        private static LocalDate birthdate;
        private String password;
        private Float balance = 0.0f;
        private List<Integer> transactions;

        // Constructor
        public User(String name, String email, LocalDate birthdate, String password, Float balance) { //Crea instancias de la clase User para inicializar los campos
            this.name = name;
            this.email = email;
            this.birthdate = birthdate;
            this.password = password;
            this.balance = balance;
        }
        public String printinfo() { //Crea el metodo printinfo() para imprimir las variables del User
            return "Nombre: " + name + "\n" +
                    "Email: " + email + "\n" +
                    "Fecha de nacimiento: " + birthdate + "\n" +
                    "Contraseña: " + password;
        }
    }

    private static void secondmenu() {

        System.out.println("-----------------------------");
        System.out.println("Este es su banco de confianza \n" +
                "Ingrese una de las siguientes opciones: \n" +
                "1. Consultar saldo\n" +
                "2. Depositar \n" +
                "3. Retiros \n" +
                //"4. Transferencias \n" +  <-- En desarrollo
                "4. Ver movimientos \n" +
                "5. Log out \n");
        int option2 = sc.nextInt();
        sc.nextLine();

        switch (option2) {
            case 1:
                // Muestra el saldo actual
                System.out.println("Su saldo actual es de $ " + balance);
                break;
            case 2:
                deposit();
                break;
            case 3:
                // realizar retiros
                withdrawals();
                break;
            //case 4:
                // realizar transferencias

                //break;
            case 4:
                showTransactions();
                break;
            case 5:
                currentUser = null; // Cerrar sesión
                System.out.println("Sesión cerrada. Regresando al menú principal.");
                break;
            default:
                System.out.println("Ingrese una opción válida");
        }

        // Si el usuario aún no ha cerrado sesión, mostrar el menú secundario nuevamente
        if (currentUser != null) {
            secondmenu();
        }

    }

    private static void deposit() {
        //Solicita ingresar el detalle del deposito
        System.out.println("Ingrese el detalle del depósito: \n");
        //Almacena en la variable "detail"
        String detail = sc.nextLine();
        //Solicita el monto a depositar
        System.out.println("Ingrese el valor del depósito:");
        //Almacena el valor del deposito
        float amount = sc.nextFloat();
        sc.nextLine(); //Limpia el scanner
        //Validación que el monto a depositar sea positivo
        if (amount > 0 ) {
            //Si es positivo, suma el valor del deposito a la variable balance
            balance = balance + amount;
            //Se crea la variable transactionID en donde se almacena el código que se genera con la función generateTransactionID()
            int transactionID = generateTransactionID();
            // Registrar la transacción en el diccionario (llave =transactionID, valor = (detail - amount)
            transactions.put(transactionID, "Detalle: " + detail + " - Valor: " + amount);
            //Imprime mensaje de deposito exitoso
            System.out.println("Depósito realizado correctamente. ID de transacción: " + transactionID);

        }else {
            System.out.println("Intente de nuevo.");

        }

    }
    //Función para generar el ID automaticamente de cada transacción realizada
    private static int generateTransactionID() {
        //Retorna un valor aleatorio de tipo int de 5 dígitos que será el ID de la transacción
        return random.nextInt(99999);
    }

    private static void showTransactions() {
        //Valida si el diccionario está vacío
        if (transactions.isEmpty()) {
            //Imprime mensaje de diccionario vacío
            System.out.println("No hay transacciones registradas.");
        } else {
            //Si el diccionario tiene transacciones, imprime el siguiente mensaje
            System.out.println("Transacciones registradas:");
            //Recorre el diccionario de transacciones con el for e imprime llave con el entry.getKey() e imprime el valor con entry.getValue()
            for (Map.Entry<Integer, String> entry : transactions.entrySet()) {
                System.out.println("ID: " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }
    private static void withdrawals() {
        //Solicita el monto a retirar
        System.out.println("Ingrese el monto a retirar: ");
        //Se almacena en la variable "amount"
        float amount = sc.nextFloat();
        //Para esta función se deja el detalle de la transacción inmutable
        String detail = "Retiro";

        //Validar si el monto a retirar es menor al saldo
        if (amount <= balance){
            // Usa la variable transactionID y le asigna un ID, llamando la función generateTransactionID()
            int transactionID = generateTransactionID();
            //Actualiza el saldo de la variable "balance"
            balance = balance - amount;
            //Agrega al diccionario "transactions" (llave, valor) (número del ID, detalle - cuantía)
            transactions.put(transactionID, "Detalle: " + detail + " - Valor: " + amount);
            //Imprime mensaje de transaccion exitosa
            System.out.println("Retiro realizado exitosamente. ID transacción: " + transactionID);
        }else {
            //Imprime mensaje de error, en caso de que el valor del retiro sea mayor al saldo.
            System.out.println("Error al realizar el retiro. Valide sus fondos");
        }
    }
}
