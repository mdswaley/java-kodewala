package Method;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 425;

        int res = reverseNum(num);

        System.out.println(res);
    }

    static int reverseNum(int num){
        int rev = 0;

        while(num > 0){
            rev = (rev * 10) + num % 10;
            num /= 10;
        }

        return rev;
    }
}
