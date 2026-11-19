package Loops.Medium;

public class PrintNumber2 {
    public static void main(String[] args) {
        int num = 23432;

        System.out.println("Count number of digit is given number : "+countNumber(num));
        System.out.println("Sum of digit is : "+sumOfDigit(num));
        System.out.println("Reverse a Number : "+reverseNumber(num));
        System.out.println("Palindrome number check for : "+num+" is -> "+palindromeNumber(num));
        System.out.println("Largest digit in number is : "+largestDigit(num));
        System.out.println("Count the occurrence of give digit in number : "+countOccurrence(num, 2));
        System.out.println("Power of number is : "+powerOfNumber(2, 5));
        System.out.println("Armstrong number check : "+armstrongNumber(1634));
    }

    private static int countNumber(int n){
        int count = 0;

        while(n > 0){
            count++;
            n /= 10;
        }

        return count;
    }

    private static int sumOfDigit(int n){
        int sum = 0;

        while (n > 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    private static int reverseNumber(int n){
        int res = 0;

        while(n > 0){
            res = res * 10 + (n % 10);
            n /= 10;
        }

        return res;
    }

    private static boolean palindromeNumber(int number){
        int rev = reverseNumber(number);

        if(number == rev){
            return true;
        }

        return false;
    }

    private static int largestDigit(int num){
        int max = 0;

        while (num > 0){
            max = Math.max(max, num % 10);
            num /= 10;
        }

        return max;
    }

    private static int countOccurrence(int num, int digit){
        int count = 0;

        while (num > 0){
            int rem = num % 10;

            if(rem == digit){
                count++;
            }
            num /= 10;
        }

        return count;
    }

    private static int powerOfNumber(int base, int pow){
        int res = 1;

        for(int i=0;i<pow;i++){
            res *= base;
        }

        return res;
    }

    private static boolean armstrongNumber(int num){
        int copy = num;
        int res = 0;
        int count = countNumber(num);

        while (num > 0){
            int rem = num % 10;
            res += (int) Math.pow(rem, count);
            num /= 10;
        }

        return res == copy;
    }
}
