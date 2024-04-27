package PLATZI;

public class HolaMundo {

    public static void main(String [] args){
        int speed;
        speed = 10;
        System.out.println(speed);

        int salary = 0;
        salary += 180000;
        String employname = "Alejandro Calle ";
        System.out.println("Nombre del empleado: " + employname);
        System.out.println(salary);

        salary -= 500;
        System.out.println(salary);
        employname = employname + "Gallego";
        System.out.println(employname);
        employname = "Cris " + employname;
        System.out.println(employname);
    }

}
