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
    public void processPayment() {

    }

    @Override
    public void serviceCharge() {

    }

    @Override
    public void cancelAppointment() {

    }
}
