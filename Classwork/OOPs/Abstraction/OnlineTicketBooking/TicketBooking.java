package OOPs.Abstraction.OnlineTicketBooking;

class TicketBooking {
    private Long ticketPrice;

    void bookTicket(){
        boolean res = checkAvailability();

        if (res){
            processPayment();
        } else{
            return;
        }

        String ticket = generateTicket();
        System.out.println("Successfully generate Ticket : "+ticket);
    }

    private boolean checkAvailability(){
        System.out.println("Checking availability of ticket.");
        return true;
    }

    private void processPayment(){
        System.out.println("Processing payment.");
    }

    private String generateTicket(){
        System.out.println("Generating ticket");
        return "XYZ0024";
    }
}

class Main{
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking();
        ticketBooking.bookTicket();
    }
}
