package com.Interface.Interface8;

public interface IBooking {
    void book();
    void cancelBooking();
    void checkStatus();
    void search();

//    suppose in future requirement to add autoUpgrade() which is only for Train
//    so if I add abstract method interface will force to other method implement method autoUpgrade()
//    for that java introduce default method in java 1.8 (2020)
//    default method must have body

    default void autoUpgrade(){
        System.out.println("IBooking.autoUpgrade()...");
    }
}
