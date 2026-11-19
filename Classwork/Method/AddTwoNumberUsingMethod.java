package Method;

public class AddTwoNumberUsingMethod {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        int res = AddTwoNumberUsingMethod.addNumber(n1, n2);

        System.out.println("Result : "+res);
    }

    static int addNumber(int a, int b){
        return a + b;
    }
}
