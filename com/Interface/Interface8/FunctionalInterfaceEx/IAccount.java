package com.Interface.Interface8.FunctionalInterfaceEx;

@FunctionalInterface
public interface IAccount {
    void openAccount(); // Functional Interface :- having only one abstract method - SAM (Single abstract Method)

    default void addBenefits(){
        System.out.println("Benefits...");
    }
}
