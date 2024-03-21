package entregables.examen3;

import java.util.Scanner;

public class figuraGeometrica {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float hight = getHigh();
        float width = getHigh();

        float area = findArea(hight, width);
        System.out.println("Area: " + area);
        //Logica para el menu//
        //Guardar datos en matriz//
        //Imprima resultados
    }

    public static float findArea(float hight ,float width){
        return hight * width;
    }

    public static float findPerimeter(float hight ,float width){
        return (2 * hight) + (2 * width);
    }

    public static void saveData(){

    }

    public static void printData(){

    }

    public static float findHypotenuse(float hight ,float width){
        return (float) (hight * Math.sqrt(2));
    }

    public static float getHigh (){
        System.out.println("Ingrese el alto: ");
        float high = sc.nextFloat();
        sc.nextLine();
        return high;
    }

    public static float getWidth (){
        System.out.println("Ingrese el ancho: ");
        float width = sc.nextFloat();
        sc.nextLine();
        return width;
    }




}
