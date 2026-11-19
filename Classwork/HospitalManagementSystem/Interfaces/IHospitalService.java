package HospitalManagementSystem.Interfaces;

public interface IHospitalService {
    void bookAppointment();

    void cancelAppointment();

    default void hospitalServiceInfo() {
        System.out.println("Welcome to City Hospital");
        System.out.println("We provide healthcare services.");
        connectWithDB();
    }

    static boolean isValidatePatientAge(int age){
        return age > 0 && age <= 120;
    }

    private void connectWithDB(){
        System.out.println("Connecting with DB");
    }
}
