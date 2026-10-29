package TrickyQuestions;

/**
 * This class is explained about static method hiding
 */
class Employee {
    public static void show(){
        System.out.println("Employee class");
    }
}
class Manager extends Employee {
    public static void show(){
        System.out.println("Manager class");
    }
}

/**
 * without static method if upcasting then print child class method bcz overridden
 * with static method prints reference class method bcz of method hiding (static belongs to class not object)
 * */

class Main{
    public static void main(String[] args) {
        Employee employee = new Manager();
        employee.show();
    }
}
