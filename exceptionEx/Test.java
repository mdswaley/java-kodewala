package exceptionEx;

public class Test {
    public static void main(String[] args) {

        Test test = new Test();

        try
        {
            test.check("MD", 0, -10, "");
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException : "+e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException : "+e.getMessage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException : "+e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Exception : "+e.getMessage());
        }

    }

    public void check(String name, int num, int age, String email){

        if (name == null){
            throw new NullPointerException("name is null...");
        }

        if (num == 0){
            throw new ArithmeticException("Number cannot be zero");
        }

        if (age < 0){
            throw new IllegalArgumentException("age cannot be negative");
        }

        if (email.isBlank()){
            throw new IllegalArgumentException("email cannot be empty");
        }

        System.out.println("All validations passed!");
    }
}
