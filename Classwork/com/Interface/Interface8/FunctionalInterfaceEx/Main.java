package com.Interface.Interface8.FunctionalInterfaceEx;

public class Main {
    public static void main(String[] args) {
        IAccount account = () -> { // () -> symbol of lambda expression
            System.out.println("Account is opening....");
        };

        account.openAccount();

        IAccount2 account2 = (name, address, amt) -> {
            System.out.println("Opening account for : "+name);
            return "Account opened";
        };

        String res = account2.openAccount("Swaley", "BTM Layout", 2000); // print :- Opening account for : Swaley
        System.out.println(res); // print :- Account opened

    }
}
