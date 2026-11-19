package Operators;

public class DlEligibility {
    public static void main(String[] args) {
        String name = args[0];
        int userAge = Integer.parseInt(args[1]); // if you pass 22years then NumberFormatException 
        
        if(userAge > 18){
            System.out.println("User is eligible for DL : "+name);
        }else{
            System.out.println("User is not eligible for DL : "+name);
        }
    }
}
