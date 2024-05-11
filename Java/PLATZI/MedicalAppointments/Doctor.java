package PLATZI.MedicalAppointments;


public class Doctor {


    static Integer id = 0; //Autoincrement
    String name;
    String email;
    String speciality;

    //Contructores


    public Doctor() {
        System.out.println("Contruyendo el objeto Doctor");
        id++;
    }

    public Doctor( String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    //Comportamientos
    public void showName(){
        System.out.println("El nombre del doctor es: " + name);
    }

    public void showId(){
        System.out.println("El id del doctor es: " + id);
    }
}
