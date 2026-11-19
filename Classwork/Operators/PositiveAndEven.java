package Operators;

public class PositiveAndEven {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if(num > 0 && num % 2 == 0){
            System.out.println("Number is positive also even..");
        }else{
            System.out.println("not a valid number..");
        }
    }
}
