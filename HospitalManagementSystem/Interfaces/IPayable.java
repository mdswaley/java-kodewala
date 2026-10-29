package HospitalManagementSystem.Interfaces;

public interface IPayable extends IHospitalService{
    void processPayment();

    void serviceCharge();
}
