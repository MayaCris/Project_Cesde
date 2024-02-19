package ejercicios;

public class EjercicioCasteo {
    public static void main(String[] args){
        short salario1 = 20000;
        short salario2 = 10000;
        short salario3 = 10000;
        int sumaSalario = (int) (salario1 + salario2 + salario3);
        if (sumaSalario > 50000) {
            System.out.println("La suma de los salarios es: " + sumaSalario);
        } else {
            System.out.println("Su salario es muy bajo");
        }

        }





    }




