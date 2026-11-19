package HospitalManagementSystem.Model;

public class Patient extends Person{
    private String medicalHistory;

    public Patient(long id, String name, int age, String medicalHistory) {
        super(id, name, age);
        this.medicalHistory = medicalHistory;
    }

    @Override
    public void displayRoleSpecificDetails() {
        System.out.println("Role : Patient");
        System.out.println("Medical History: " + medicalHistory);
    }

    public void updateMedicalHistory(String updatedHistory){
        this.medicalHistory = updatedHistory;
    }

    public String getMedicalHistory(){
        return medicalHistory;
    }

}
