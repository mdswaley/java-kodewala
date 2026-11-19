package OOPs.Overloading;

class Login {

//    overloading can have different version of method and all have their own functionality
//    overloaded method can be static
    void doLogin(String email, String password){ // v1
        System.out.println("login with email and password");
    }

    static void doLogin(String mobileNumber, int otp){ // v2
        System.out.println("login with mobile number and otp");
    }

    void doLogin(String email){ // v3
        System.out.println("login with email");
    }
}

class Main{
    public static void main(String[] args) {
        Login login = new Login();
        login.doLogin("md@gmail.com","md232");

//        bcz of static we can call directly with name of class.
        Login.doLogin("283743927", 8321);
        login.doLogin("md@gmail.com");
    }
}
