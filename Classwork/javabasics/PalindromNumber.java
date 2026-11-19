package javabasics;

public class PalindromNumber {
    public static void main(String[] args) {
        int n = 11211;
        int org = n;

        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        if(org == rev){
            System.out.println("Is a palindrom number.");
        }else{
            System.out.println("Not a palindrom number.");
        }
    }
}
