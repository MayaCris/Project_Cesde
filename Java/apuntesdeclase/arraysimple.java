package apuntesdeclase;

public class arraysimple {
    public static void main(String[] args) {

        // Recorrer con while un array y me imprime lo que tiene el array

        int[] ages = {25,32,19,24,51,32};
        int indice = 0;
        System.out.println("El arreglo tiene: " + ages.length + "elementos");
        System.out.println("El elmento en la posición 5 es: " + ages[5]);

        while (indice < 6){

            System.out.println(ages[indice]);
            indice++;
        }
    }
}
