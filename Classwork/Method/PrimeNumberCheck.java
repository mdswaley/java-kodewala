package Method;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num = 11;

        boolean res = primeCheck(num);

        if(res){
            System.out.println("Is a prime Number...");
        }else{
            System.out.println("Not a prime Number...");
        }
    }

    static boolean primeCheck(int num){
        
        if(num <= 1) return false;

        for(int i=2;i<num;i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
