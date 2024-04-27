package PLATZI;

public class OperadorLogico {
//    public static void main(String[] args) {
//
//        float minScore = 3.5f;
//
//        short minAge = 17;
//
//        float aspirantScore = 4.0f;
//
//        short age = 16;
//
//        boolean scoreResult = aspirantScore >= minScore;
//        boolean ageResult = age >= minAge;
//        boolean canEnroll = ageResult && scoreResult;
//
//        System.out.println("El Resultado de su prueba es mayor que 3.5: " + scoreResult + "\n" +
//                "Adicional, su edad es mayor que 17: " + ageResult + "\n" +
//                "Por tanto, el resultado de su adminisión es: " + canEnroll);
//    }
    public static void main(String[] args) {
        int a = 8;
        int b= 5;

        //Operadores de asignación
        System.out.println("a == b? " + (a == b));
        System.out.println("a != b? " + (a != b));

        //Operadores relacionales
        System.out.println("\na > b? " + (a > b));
        System.out.println("a < b? " + (a < b));
        System.out.println("a >= b? " + (a >= b));
        System.out.println("a <= b? " + (a <= b));

        System.out.println("Validacion con IF: \n");
        if ((a==b) || (a>b)) {
            System.out.println("a == b");
        }else if(a != b){
            System.out.println("a != b");
        }else if(a > b){
            System.out.println("a > b");
        }else if(a < b){
            System.out.println("a < b");
        }else if(a >= b){
            System.out.println("a >= b");
        }else if(a <= b){
            System.out.println("a <= b");
        }

    }

}
