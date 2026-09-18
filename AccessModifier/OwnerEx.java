package AccessModifier;

public class OwnerEx {
    public static void main(String[] args) {
        
    }
}

class Client1{
    public void display(){
        System.out.println("Chient1 is called...");
    }
}

class Client2 extends Client1{
    protected  void display(){ // if you decrease child class data accessebility it will give compile time error. like public -> protected, protected -> default etc
        // But if you increase like protected -> public, default -> protected it will work.
        System.out.println("Chient2 is called...");
    }
}
