package StringClass.Basics;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println("Sting : "+s+" is "+checkPalindrome(s));

    }

    private static boolean checkPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }

        return true;
    }
}
