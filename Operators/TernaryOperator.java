package Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        String carColor = args[0];
        
        boolean isValid = carColor.equals("blue") ? true : false;

        if(isValid){
            System.out.println("we have "+carColor+" color car");
        }else{
            System.out.println("Don't have");
        }
        
    }
}
