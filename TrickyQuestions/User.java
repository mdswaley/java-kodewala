package TrickyQuestions;


/**
 * The reason is that static methods declared inside an interface are not inherited by implementing classes
 * and cannot be accessed through an instance reference.
 */
interface User {
     static void displayDetails(){
        System.out.println("User Details.");
    }
}

class Admin implements User{
    static void displayDetails(){
        System.out.println("Admin Details.");
    }
}
/**
 *The show() method belongs to interface A. It is not an instance method.
 */

class Main3{
    public static void main(String[] args) {
        User user = new Admin();
//        this give compilation error bcz we can't create object of interface
//        user.displayDetails();

//        we need to access it directly
        User.displayDetails();
    }
}
