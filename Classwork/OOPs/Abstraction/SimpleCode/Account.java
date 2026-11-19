package OOPs.Abstraction.SimpleCode;

class Account {
    private int balance;

    public void credit(){
        validatePin("4834");
        checkBalance();

        System.out.println("Transfer fund...");
    }

    private int checkBalance(){
        System.out.println("Checking balance");
        return balance;
    }

    private boolean validatePin(String pin){
        System.out.println("Validating PIN");
        return true;
    }
}
