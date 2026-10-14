package Contents;

public class IDBIBank {

    String accountNumber;
    public static int count;

//    Instance init Block
    {
        count++;
    }

    IDBIBank(String accountNumber){
        System.out.println("Inside IDBIBank() constructor");
        this.accountNumber = accountNumber;
    }

    IDBIBank(){
        System.out.println("No Param Constructor");
    }

    public static void main(String[] args) {
        IDBIBank idbiBank = new IDBIBank("9480937403");

        IDBIBank idbiBank2 = new IDBIBank("9384834292");

        IDBIBank idbiBank3 = new IDBIBank();

        System.out.println("Total number of User : "+count);
    }
}
