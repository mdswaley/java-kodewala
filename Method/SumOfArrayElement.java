package Method;

public class SumOfArrayElement {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 45, 12, 22};

        int res = findSum(arr);

        System.out.println(res);
    }

    static int findSum(int[] arr){
        int sum = 0;

        for(int num : arr){
            sum += num;
        }

        return sum;
    }
}
