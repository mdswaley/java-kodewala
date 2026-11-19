package HospitalManagementSystem.Service;

import HospitalManagementSystem.Interfaces.IPayable;
import HospitalManagementSystem.Model.Doctor;
import HospitalManagementSystem.Model.Patient;

public class Consultation implements IPayable {
    private Doctor doctor;
    private Patient patient;
    private boolean appointmentBooked;
    private boolean paymentCompleted;

    public Consultation(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    @Override
    public void bookAppointment() {
        if (!appointmentBooked) {
            appointmentBooked = true;
            System.out.println("Appointment booked successfully for "+ patient.getName());
        } else {
            System.out.println("Appointment is already booked.");
        }
    }

    @Override
    public boolean processPayment() {
        if (paymentCompleted) {
            System.out.println("Payment has already been completed.");
            return true;
        }

        paymentCompleted = true;
        System.out.println("Payment successful: ₹" + serviceCharge());
        return true;
    }

    @Override
    public double serviceCharge() {
        return doctor.getConsultationFee();
    }

    @Override
    public void cancelAppointment() {
        if (appointmentBooked && !paymentCompleted) {
            appointmentBooked = false;
            System.out.println("Appointment cancelled successfully.");
        } else if (paymentCompleted) {
            System.out.println("Payment has been completed. Process a refund before cancellation.");
        } else {
            System.out.println("No appointment exists to cancel.");
        }
    }
}
