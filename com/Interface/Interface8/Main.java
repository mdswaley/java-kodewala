package com.Interface.Interface8;

class Main {
    public static void main(String[] args) {
        IBooking iBooking = new TrainBooking();

        iBooking.book();
        iBooking.checkStatus();
        iBooking.autoUpgrade();
    }
}
