package com.Interface.Interface8;

public class FlightBooking implements IBooking{
    @Override
    public void book() {
        System.out.println("Flight book");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Flight is canceled");
    }

    @Override
    public void checkStatus() {
        System.out.println("Available");
    }

    @Override
    public void search() {
        System.out.println("source to destination of Flight");
    }

    //    here we're printing the common functionality
    public void printTicket(){
        IBooking.printTicket();
    }
}
