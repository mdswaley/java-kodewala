package com.Interface.Interface8;

public class TrainBooking implements IBooking{
    @Override
    public void book() {
        System.out.println("Train book");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Train is canceled");
    }

    @Override
    public void checkStatus() {
        System.out.println("Available");
    }

    @Override
    public void search() {
        System.out.println("source to destination of Train");
    }

    @Override
    public void autoUpgrade() {
        System.out.println("autoUpgrade feature for Train Booking");
    }

//    here we're printing the common functionality
    public void printTicket(){
        IBooking.printTicket();
    }
}
