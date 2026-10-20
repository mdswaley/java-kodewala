package OOPs.Overriding;

class Accounts {
    void openAccount(){
        System.out.println("Account.openAccount()..");
    }
}

class SavingAccount extends Accounts{

//    Method name should be same.
//    Type, order and number of args should be same
//    Return type should be same except covariant
//    Access modifier --> should be same or wider ( public --> public,
//    protected --> public, default --> protected etc)

    @Override // we are telling compiler that- i am overriding the method. please check all the rules.
    void openAccount(){
        System.out.println("SavingAccount.openAccount()...");
    }
}
