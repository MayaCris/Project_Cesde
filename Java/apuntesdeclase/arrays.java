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

//        Scanner sc = new Scanner(System.in);

//        int salarios[] = new int[5];
//        for (int i = 0; i< salarios.length; i++){
//            System.out.println("Agregue salario " + (i+1));
//            salarios[i] = sc.nextInt();
//        }


        String[] androidVersions = new String[4];
        String days[] = new String[7];


        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }

        System.out.println("\nPrint with forEach");
        for (String androidVersion : androidVersions) {
            System.out.println(androidVersion);
        }

        System.out.println();
        System.out.println();


        String[][] cities = new String[4][2]; //4 * 2 = 8 (Tamaño del array bidimensional)

        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+

         * Primer elemento [] --> Renglon -- Segundo elemento[] --> Columna

         * */

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        System.out.println("\nPrint with forEach cities");
        for (String[] city : cities) {
            for (String name : city) {
                System.out.println(name);
            }
        }

        System.out.println();
        System.out.println();

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                for (int k = 0; k < animals[i][j].length; k++) {
                    for (int l = 0; l < animals[i][j][k].length; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }

        // System.out.println(animals[1][0][0][1]);

        System.out.println();
        System.out.println();

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        int x = 1;
        while (x <= 10) {
            System.out.println(++x);
        }

     }
}
