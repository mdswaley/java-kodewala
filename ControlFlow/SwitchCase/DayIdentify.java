package ControlFlow.SwitchCase;

public class DayIdentify {
    public static void main(String[] args) {
        int dayInput = Integer.parseInt(args[0]);
        getDayByNumber(dayInput);
    }

    private static void getDayByNumber(int num){

        switch (num){
            case 1:
                System.out.println("Mon");
                break;

            case 2:
                System.out.println("Tue");
                break;

            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thu");
                break;

            case 5:
                System.out.println("Fri");
                break;

            case 6:
                System.out.println("Sat");
                break;

            case 7:
                System.out.println("Sun");
                break;

            default:
                System.out.println("Not a valid input..");
                break;
        }
    }
}
