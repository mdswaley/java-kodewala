package ControlFlow.FlightTicketBookingRepo;

/*
Flight ticket Booking system. calculating discount of ticket
 */

public class FlightTicketBooking {
    double discount;

    public double flightTicketDiscount(double ticketPrice){

        if(ticketPrice <= 3000){
            discount = 0;
            System.out.println("No discount...");
        }else if (ticketPrice > 3000 && ticketPrice < 8000){
            discount = ticketPrice * 8 / 100;
        }else if (ticketPrice > 8000){
            discount = ticketPrice * 12 / 100;
        }else{
            System.out.println("Not a valid Booking...");
            return 0;
        }

        if (discount > 1500){
            discount = 1500;
        }

        return discount;
    }
}
