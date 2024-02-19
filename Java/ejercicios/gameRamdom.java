package ejercicios;

public class gameRamdom {
    public static void main(String[] args) {
        //Juego en donde me arroje un número aleatorio, si es par me sume puntos, si es impar disminuye vidas

        int life = 10;
        int points = 0;
        int round = 0;

        while (life > 0) {
            int num = (int) (Math.random() * 10);
            if (num%2 == 0){
                points++;
                round++;
                System.out.println("Sus puntos son: " + points);
                System.out.println("Sus vidas son: " + life);
                System.out.println("Número de ronda: " + round + "\n");


            }else {
                life--;
                round++;
                System.out.println("Sus puntos son: " + points);
                System.out.println("Sus vidas son: " + life);
                System.out.println("Número de ronda: " + round + "\n");
                if (life == 0 ){
                    System.out.println("Game over");
                }
            }
        }


    }
}
