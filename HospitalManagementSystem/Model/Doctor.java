package HospitalManagementSystem.Model;

public class Doctor extends Person{

    private String specialization;
    private double consultationFee;

    public Doctor(long id, String name, int age, String specialization, double consultationFee) {
        super(id, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }


    @Override
    public void displayRoleSpecificDetails() {
        System.out.println("Role: Doctor");
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: ₹" + consultationFee);
    }
}
