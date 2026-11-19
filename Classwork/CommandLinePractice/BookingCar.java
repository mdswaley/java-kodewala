package CommandLinePractice;

public class BookingCar {
    public static void main(String[] args) {

        if(args.length < 4){
            System.out.println("Please Enter all details of car ");
            return;
        }

        String carName = args[0];
        String color = args[1];
        double carPrice = Double.parseDouble(args[2]);
        String modelName = args[3];


        System.out.println("Booking "+carName+" with color "+color+" price : "+carPrice+" model name "+modelName);

    }
}
