package PLATZI;

public class WhileLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        turnOnOffLight();
        System.out.println("Light is turned on");

        int i = 1;



        while (isTurnOnLight && i<=10){
            printSOS();
            i++;
        }

    }

    public static void  printSOS(){
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight() {
        //Operador ternario
        isTurnOnLight = (isTurnOnLight)?false:true;

        return isTurnOnLight;
    }


}
