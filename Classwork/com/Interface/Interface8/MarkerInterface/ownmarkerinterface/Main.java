package com.Interface.Interface8.MarkerInterface.ownmarkerinterface;

public class Main {
    public static void main(String[] args) {
        User user = new User("ABC234", "Swaley");

        DataCleanable dataCleanable = new DataCleanable();

        dataCleanable.clean(user);
    }
}
