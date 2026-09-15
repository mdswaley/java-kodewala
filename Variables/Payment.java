package Variables;

public class Payment{
    static int total; // static variables

    public static void main(String[] args) {
        int balance = 1000;
        int balanceDeduction = 100;
        
        total = balance - balanceDeduction;

        System.out.println("Total available balance : " + total); // Total available balance : ---> static 
        // total ---> dynamic

        m2();
    }

    static void m2(){
        System.out.println(total);
    }
}