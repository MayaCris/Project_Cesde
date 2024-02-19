package apuntesdeclase;

public class OperadorLogico {
    public static void main(String[] args) {

        float minScore = 3.5f;

        short minAge = 17;

        float aspirantScore = 4.0f;

        short age = 16;

        boolean scoreResult = aspirantScore >= minScore;
        boolean ageResult = age >= minAge;
        boolean canEnroll = ageResult && scoreResult;

        System.out.println("El Resultado de su prueba es mayor que 3.5: " + scoreResult + "\n" +
                "Adicional, su edad es mayor que 17: " + ageResult + "\n" +
                "Por tanto, el resultado de su adminisión es: " + canEnroll);


    }
}
