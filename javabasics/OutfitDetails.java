package javabasics;

public class OutfitDetails {
    public static void main(String[] args) {
        String gender = args[0];
        String name = "";
        double price = 0.0;

        if(gender.equals("male")){
            System.out.println("Male category");
            name = args[1];
            price = Double.parseDouble(args[2]);
        }else{
            System.out.println("female category");
            name = args[1];
            price = Double.parseDouble(args[2]);
        }

        System.out.println(name);
        System.out.println(price);


    }
}
