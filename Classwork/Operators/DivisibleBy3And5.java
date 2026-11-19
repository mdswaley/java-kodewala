package Operators;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Number : "+num+" is Divisible by 3 and 5");
        }else{
            System.out.println("Not Divisible..");
        }
    }
}
