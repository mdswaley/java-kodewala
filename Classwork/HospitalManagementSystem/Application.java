package HospitalManagementSystem;

import HospitalManagementSystem.Interfaces.IPayable;
import HospitalManagementSystem.Model.Doctor;
import HospitalManagementSystem.Model.Patient;
import HospitalManagementSystem.Service.Consultation;
import HospitalManagementSystem.Service.LabTest;
import HospitalManagementSystem.Service.MedicalReport;

public class Application {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(101, "Dr. Raaj", 47, "Cardiology", 800);

        Patient patient = new Patient(201, "Rahul", 28, "High blood pressure");

        System.out.println("===== DOCTOR DETAILS =====");
        doctor.displayBasicInfo();
        doctor.displayRoleSpecificDetails();

        System.out.println("\n===== PATIENT DETAILS =====");
        patient.displayBasicInfo();
        patient.displayRoleSpecificDetails();

        System.out.println("\n===== CONSULTATION =====");

        Consultation consultation = new Consultation(doctor, patient);

        consultation.hospitalServiceInfo();
        consultation.bookAppointment();

        System.out.println("Consultation Fee: ₹"+consultation.serviceCharge());

        consultation.processPayment();

        System.out.println("\n===== LAB TEST =====");

        LabTest labTest = new LabTest("Blood Test", 500, patient);

        labTest.bookAppointment();
        labTest.displayTestDetails();

        System.out.println("Lab Test Charge: ₹"+labTest.serviceCharge());

        labTest.processPayment();

        System.out.println("\n===== RUNTIME POLYMORPHISM =====");

        IPayable payable = consultation;
        System.out.println("Consultation Charge: ₹" + payable.serviceCharge());

        payable = labTest;
        System.out.println("Lab Test Charge: ₹" + payable.serviceCharge());

        System.out.println("\n===== MEDICAL REPORT =====");

        MedicalReport report = new MedicalReport(patient, "Blood Test Report",
                "Results require review by the treating doctor.");

        report.generateMedicalReport();
        report.displayReportDetails();

    }
}
