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
//        user.displayDetails();
    }
}
