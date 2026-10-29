package HospitalManagementSystem.Service;

public interface IHospitalService {
    void bookAppointment();

    void cancelAppointment();

    default void hospitalServiceInfo() {
        System.out.println("Welcome to Hospital Management System");
    }
}
