package CommandLinePractice;

public class Grocery {
    public static void main(String[] args) {
        String itemName = args[0];
        String fressness = args[1];
        Double price = Double.parseDouble(args[2]);

        System.out.println("you ordered : "+itemName+" comming before : "+fressness+" price : "+price);
    }
}
