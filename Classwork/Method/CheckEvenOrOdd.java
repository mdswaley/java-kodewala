package Method;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        boolean res = checkEvenOrOdd(num);

        if(res){
            System.out.println("number is Even...");
        }else{
            System.out.println("number is Odd...");
        }
    }

    static boolean checkEvenOrOdd(int num){
        return num % 2 == 0;
    }
}
