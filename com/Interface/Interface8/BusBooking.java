package com.Interface.Interface8;

public class BusBooking implements IBooking{
    @Override
    public void book() {
        System.out.println("Bus booking");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Bus is canceled");
    }

    @Override
    public void checkStatus() {
        System.out.println("Available");
    }

    @Override
    public void search() {
        System.out.println("source to destination of Bus");
    }
}
