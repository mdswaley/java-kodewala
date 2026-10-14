package OOPs.Encaptulation.ATMPinValidation;

import javax.naming.AuthenticationException;

public class ImplementATM {
    public static void main(String[] args) {
        ATM atm = new ATM(4356, 6000);

        try {
            atm.withdraw(4356, 2000);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        double res = atm.getBalance();

        System.out.println("Available balance : "+res);

        try {
            atm.changePin(4356, 8237); // here i have update the pin
        } catch (AuthenticationException ex){
            System.out.println(ex.getMessage());
        }


        try {
            atm.withdraw(4356, 2000); // should give updated pin
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Available balance : "+res);

    }
}
