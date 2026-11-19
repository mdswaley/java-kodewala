package Method;

public class FindMaximumThreeNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 15;

        int res = maxCheck(a, b, c);

        System.out.println("max value is : "+res);
    }

    static int maxCheck(int a, int b, int c){
        if(a > b){
            if(a > c){
                return a;
            }
        }else if(b > a){
            if(b > c){
                return b;
            }
        }
        return c;
    }
}
