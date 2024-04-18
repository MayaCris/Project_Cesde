package MedicalAppointments;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.showName();
        myDoctor.name = "Alejandro Calle";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println("Otra forma de mostrarlo: " + Doctor.id);

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();
        System.out.println("Otra forma de mostrarlo: " + Doctor.id);

    }
}
