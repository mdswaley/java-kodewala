package Method;

public class PalindromNumber {
    public static void main(String[] args) {
        int num = 1221;

        boolean res = palindromCheak(num);

        System.out.println(res);
    }

    static boolean palindromCheak(int num){
        int copy = num;
        int rev = 0;

        while(num > 0){
            rev = (rev * 10) + num % 10;
            num /= 10;
        }

        return copy == rev;
    }
}
