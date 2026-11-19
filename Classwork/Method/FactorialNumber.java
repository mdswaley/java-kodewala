package Method;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;

        int res = calFact(num);

        System.out.println(res);
    }

    static int calFact(int num){
        int fact = 1;

        for(int i=1;i<=num;i++){
            fact *= i;
        }

        return fact;
    }
}
