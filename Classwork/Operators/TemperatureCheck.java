package Operators;

public class TemperatureCheck {
    public static void main(String[] args) {
        if(args.length % 2 != 0){
            System.out.println("Please provide temperature and humidity pairs.");
            return;
        }

        for(int i=0;i<args.length;i+=2){
            double temp = Double.parseDouble(args[i]);
            double humidity = Double.parseDouble(args[i+1]);

            int day = (i/2) + 1;

            if(temp > 30 && humidity < 50){
                System.out.println("Day : "+day+" -> Temperature -> "+temp+"c and Humidity -> "+humidity+"%");
            }
        }
    }
}
