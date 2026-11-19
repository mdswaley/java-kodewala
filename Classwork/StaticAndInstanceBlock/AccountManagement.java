package StaticAndInstanceBlock;

class AccountManagement {
    AccountManagement(){
        System.out.println("AccountManagement.AccountManagement()");
    }
}

class Account extends AccountManagement{
    String accountNumber;

//    Instance init Block --> this will get executed whenever object is created.
    {
        System.out.println("Account IIB");
    }

    Account(String accountNumber){
        super(); // first call super()
//        IIB call after super()
        System.out.println("Inside Account() constructor");
        this.accountNumber = accountNumber;
    }
}
