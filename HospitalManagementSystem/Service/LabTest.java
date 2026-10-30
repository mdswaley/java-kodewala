package HospitalManagementSystem.Service;

import HospitalManagementSystem.Interfaces.IPayable;
import HospitalManagementSystem.Model.Patient;

public class LabTest implements IPayable {
    private String testName;
    private double testPrice;
    private Patient patient;
    private boolean appointmentBooked;
    private boolean paymentCompleted;

    public LabTest(String testName, double testPrice, Patient patient) {
        this.testName = testName;
        this.testPrice = testPrice;
        this.patient = patient;
    }

    @Override
    public void bookAppointment() {
        if (!appointmentBooked) {
            appointmentBooked = true;
            System.out.println(testName+" booked for "+patient.getName());
        } else {
            System.out.println("Lab test is already booked.");
        }
    }

    @Override
    public void cancelAppointment() {
        if (appointmentBooked && !paymentCompleted) {
            appointmentBooked = false;
            System.out.println(testName+"booking cancelled.");
        } else if (paymentCompleted) {
            System.out.println("Refund or payment adjustment is required.");
        } else {
            System.out.println("No lab test booking exists.");
        }
    }

    @Override
    public void hospitalServiceInfo() {
        IPayable.super.hospitalServiceInfo();
    }

    @Override
    public boolean processPayment() {
        if (paymentCompleted){
            System.out.println("Lab test payment already completed.");
            return true;
        }

        paymentCompleted = true;
        System.out.println("Lab test payment successful: ₹"+serviceCharge());
        return true;
    }

    @Override
    public double serviceCharge() {
        return testPrice;
    }

    public void displayTestDetails() {
        System.out.println("Test Name: " + testName);
        System.out.println("Test Price: ₹" + testPrice);
    }
}
