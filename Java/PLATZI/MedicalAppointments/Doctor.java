package MedicalAppointments;


public class Doctor {
    static Integer numDoc; // Solo fue un ejemplo


    static Integer id = 0; //Autoincrement
    String name;
    String speciality;

    //Contructores


    public Doctor() {
        System.out.println("Contruyendo el objeto Doctor");
        id++;
    }

    public Doctor(Integer id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;

    }

    //Comportamientos
    public void showName(){
        System.out.println("El nombre del doctor es: " + name);
    }

    public void showId(){
        System.out.println("El id del doctor es: " + id);
    }
}
