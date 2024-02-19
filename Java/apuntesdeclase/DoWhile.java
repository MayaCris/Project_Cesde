package apuntesdeclase;

public class DoWhile {
    public static void main(String[] args) {
        //El While valida la condicion y si se cumple, ejecuta el proceso
        //El DoWhile primero ejecuta un bloque de hacer al menos una vez y luego valida la condicilón
        //


        //Valor a validar

        String saludo = "Buenos días ";
        int personas = 5;

        do{
            System.out.println(saludo);
            personas--;
        }while(personas > 0);

    }
}
