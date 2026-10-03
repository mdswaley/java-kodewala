package Loops.Medium;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(checkPrime(16));

        int start = 1;
        int end = 100;
        System.out.println("Print All prime number in range : ("+start+", "+end+")");
        System.out.println(printPrimeNumberInRange(start,end));
    }

    private static boolean checkPrime(int n){
        if (n <= 1){
            return false;
        }

        for (int i = 2; i < n;i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    private static List<Integer> printPrimeNumberInRange(int st, int end){
        List<Integer> arr = new ArrayList<>();

        for (int i=st; i<=end;i++){
            if (checkPrime(i)){
                arr.add(i);
            }
        }

        return arr;
    }
}


