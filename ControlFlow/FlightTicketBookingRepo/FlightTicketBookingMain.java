package ControlFlow.FlightTicketBookingRepo;

public class FlightTicketBookingMain {
    public static void main(String[] args) {
        FlightTicketBooking f1 = new FlightTicketBooking();

        int amount = 4500;
        double res = f1.flightTicketDiscount(amount);

        double finalAmount = amount - res;

        System.out.println("Ticket price : "+amount);
        System.out.println("Discount : "+res);
        System.out.println("Final amount to Pay : "+finalAmount);

    }
}
