package OOPs.Inheritance.Disadvantages;

// First disadvantage is when you make changes in parent class (Accounts.java) all the override method should be updated accordingly
class Accounts {

//    second is heavy load in memory
    Accounts(){
        System.out.println("Accounts constructor."); // here I don't even call Accounts class but bcz of
        // inherited by child. So when we create object of child class parent constructor call. That means all
        // the class are load in main memory while executing
    }

    public void openAccount(String userId, String email){
        System.out.println("Accounts.openAccount()");
    }
}

class SavingAccount extends Accounts{
    @Override
    public void openAccount(String userid, String email){
        System.out.println("SavingAccount.openAccount()");
    }
}

class SrCitAccount extends SavingAccount{
    @Override
    public void openAccount(String userid, String email){
        System.out.println("SrCitAccount.openAccount()");
    }
}

class PensionAccount extends SrCitAccount{
    @Override
    public void openAccount(String userid, String email){
        System.out.println("PensionAccount.openAccount()");
    }
}

class Main{
    public static void main(String[] args) {
        PensionAccount pensionAccount = new PensionAccount();
    }
}
