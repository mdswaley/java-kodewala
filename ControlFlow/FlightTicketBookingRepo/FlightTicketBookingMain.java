package ControlFlow.FlightTicketBookingRepo;

import java.util.HashMap;
import java.util.Map;

public class FlightTicketBookingMain {
    public static void main(String[] args) {
        FlightTicketBooking booking = new FlightTicketBooking();

        Map<String, Double> users = new HashMap<>();
        users.put("Rahul", 2500.0);
        users.put("Amit", 4500.0);
        users.put("Priya", 7500.0);
        users.put("Sneha", 10000.0);
        users.put("Arjun", 15000.0);

        for(Map.Entry<String, Double> map:users.entrySet()){

            String user = map.getKey();
            double ticketPrice = map.getValue();

            double discount = booking.flightTicketDiscount(ticketPrice);

            double finalAmount = ticketPrice - discount;

            System.out.println("User        : " + user);
            System.out.println("Ticket Price: " + ticketPrice);
            System.out.println("Discount    : " + discount);
            System.out.println("Final Amount: " + finalAmount);
            System.out.println("-----------------------------");

        }

    }
}
/*
    1. What is Map.Entry?

    A Map stores data as key-value pairs.

    Java provides an inner interface called:

    Map.Entry<K, V>

    It represents one key-value pair.

    For example:

    "Rahul" -> 2500.0

    is one Map.Entry.

        users.entrySet()

        which returns a Set containing all the key-value pairs.

        Conceptually:

        users
        |
        v
        +----------------------+
        | Rahul -> 2500.0      |
        | Amit  -> 4500.0      |
        | Priya -> 7500.0      |
        +----------------------+

        users.entrySet()
            |
            v
        +----------------------+
        | Entry(Rahul, 2500)   |
        | Entry(Amit, 4500)    |
        | Entry(Priya, 7500)   |
        +----------------------+

        The return type is approximately:

        Set<Map.Entry<String, Double>>

        So:

        users.entrySet()

        means:

        Give me a collection containing every key-value pair in this map.
*/
