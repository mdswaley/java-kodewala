package com.Interface.Interface8.FunctionalInterfaceEx;

@FunctionalInterface
//public interface IAccount extends IAccountManagement { --> compilation failure. bcz IAccountManagement also having SAM
public interface IAccount {
    void openAccount(); // Functional Interface :- having only one abstract method - SAM (Single abstract Method)

//    there can be a multiple other method (static, default and private). But still it is SAM.
    default void addBenefits(){
        System.out.println("Benefits...");
    }
}

// Interview Tips:-
// if IAccount is extending another interface (IAccountManagement) which also having one abstract method
// so IAccount is no more FunctionalInterface.
// compile time error if you use annotation otherwise in interface name itself