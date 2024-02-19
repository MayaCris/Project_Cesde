package apuntesdeclase;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        //Los diferentes arrays que hay:
        //Arreglo -> vectores != de Vectores
        //Array index n-1
        //

        //String[] nombres = new String[5];
        //nombres = new String[]{"Juan", "Cris", "Pedro", "Noel"};

        //int age[] = new int[5];
        //age = new int[]{40, 36, 21, 30, 20};

        //System.out.println("El tamaño del array es " + nombres.length);

        //System.out.println(nombres[3]);
        //System.out.println(age[3]);

        //------------------------------------------------------------------------------------------

        //float[] notas = {4.5f, 5.0f, 3.9f,};
        //System.out.println("Imprimir el array con el for");

        //for (int i=0; i < notas.length; i++){
            //System.out.println("posición " + i + " es " + notas[i]);
        //}
        //System.out.println("--------");
        //for (float i: notas){
            //System.out.println(i);
        //}

        //----------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);

        int salarios[] = new int[5];
        for (int i = 0; i< salarios.length; i++){
            System.out.println("Agregue salario " + (i+1));
            salarios[i] = sc.nextInt();
        }

    }
}
