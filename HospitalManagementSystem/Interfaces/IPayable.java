package HospitalManagementSystem.Interfaces;

public interface IPayable extends IHospitalService{
    boolean processPayment();

    double serviceCharge();
}
