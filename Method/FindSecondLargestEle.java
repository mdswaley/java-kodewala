package Method;

public class FindSecondLargestEle {
    public static void main(String[] args) {
        int[] arr = {2, 3, 64, 54, 71, 83};

        int res = secondLargestEle(arr);

        System.out.println(res);
    }

    static int secondLargestEle(int[] arr){
        int second = 0;
        int max = 0;

        for(int num : arr){
            if(num > max){
                second = max;
                max = num;
            }   
        }

        return second;
    }
}
