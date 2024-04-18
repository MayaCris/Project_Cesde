package MedicalAppointments;

public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }


    Doctor(String name){
        this.name = name;
        System.out.println("El nombre del doctor asignado es " + name);

    }
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
