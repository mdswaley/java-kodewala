package FinalKeyword;

public class Employees {

}

// final class cannot be extended or cannot parent
//final class EmployeeManagement{

class EmployeeManagement{
    final double BASE_SALARY = 34000; // final variable cannot reassign or change

    public final void checkBalance(){ // final method cannot be overridden
        System.out.println("Checking balance...");
    }

    public void checkOtherDetails(){
        System.out.println("Checking other details..");
    }
}


class Manager extends EmployeeManagement{
    @Override
    public void checkOtherDetails(){
        System.out.println("Checking other details.. from Manger class");
    }
}
