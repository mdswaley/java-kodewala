package Method;

public class ValidateInput {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "heLlo";

        System.out.println(isValidInput(s1));
        System.out.println(isValidInput(s2));
    }

    private static boolean isValidInput(String s){
        if(s.length() < 3 || s.length() > 15){
            return false;
        }

        return Character.isUpperCase(s.charAt(0));
    }
}
