package TrickyQuestions;

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

class Main3{
    public static void main(String[] args) {
        User user = new Admin();
//        this give compilation error bcz we can't create object of interface
//        user.displayDetails();

//        we need to access it directly
        User.displayDetails();
    }
}
