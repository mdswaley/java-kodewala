package HospitalManagementSystem.Service;

import HospitalManagementSystem.Interfaces.IReportable;
import HospitalManagementSystem.Model.Patient;

public class MedicalReport implements IReportable {
    private Patient patient;
    private String reportType;
    private String reportDetails;

    public MedicalReport(Patient patient, String reportType, String reportDetails){
        this.patient = patient;
        this.reportType = reportType;
        this.reportDetails = reportDetails;
    }

    @Override
    public void generateMedicalReport() {
        System.out.println("Medical report generated successfully.");
    }

    @Override
    public void displayReportDetails() {
        System.out.println("Patient: " + patient.getName());
        System.out.println("Report Type: " + reportType);
        System.out.println("Report Details: " + reportDetails);
    }
}
