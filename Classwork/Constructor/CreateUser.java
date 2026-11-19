package Constructor;

class SuperUser {  // extends Object :- all class if they don't have parent explicitly extends Object class.

}

class UserDetails extends SuperUser{
    String userName;
    String userId;
    String mobile;

    UserDetails(String userName, String userId, String mobile){
        this();
        this.userName = userName;
        this.userId = userId;
        this.mobile = mobile;
    }

    UserDetails(){
        System.out.println("Calling default constructor....");
    }
}

public class CreateUser{
    public static void main(String[] args) {
        UserDetails u1 = new UserDetails("MD Swaley", "U123", "349793874");
    }
}
