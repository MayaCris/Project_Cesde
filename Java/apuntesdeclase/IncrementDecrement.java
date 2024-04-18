package apuntesdeclase;

public class IncrementDecrement {
    public static void main(String[] args) {
        //Juego para contar vidas

        int lives = 5;
        lives -= 1;
        System.out.println("Perdió una vida. Le quedan: " + lives);

        lives--; //Decremento
        System.out.println(lives);

        lives++; //Incremento

        //Forma prefija
        //Gana un regalo cuando gana una vida

        //Si se pone lives++, primero accede a lo que tiene la variable y lo suma con 100, ==> posfijo
        //Si se pone ++lives, primero suma la siguiente vida y luego la suma con 100 ==> Prefijo
        int gift = 100 + lives++;
        System.out.println("Su regalo es de: " + gift);
        System.out.println(lives);
    }
}
