package Loops.Medium;

public class PrintNumber2 {
    public static void main(String[] args) {
        System.out.println("Count number of digit is given number : "+countNumber(12534));
        System.out.println("Sum of digit is : "+sumOfDigit(2432));
    }

    public static int countNumber(int n){
        int count = 0;

        while(n > 0){
            count++;
            n /= 10;
        }

        return count;
    }

    public static int sumOfDigit(int n){
        int sum = 0;

        while (n > 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
