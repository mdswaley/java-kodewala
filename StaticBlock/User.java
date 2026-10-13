package StaticBlock;

class User {
    String userName;
    String userId;
    String mobileNumber;

    static {
        System.out.println("Inside static block. It will execute only once...");
    }

    User(String userName, String userId, String mobileNumber){
        super(); // by default every constructor first line is either super() or this
        System.out.println("Inside User constructor for "+userName);
        this.userName = userName;
        this.userId = userId;
        this.mobileNumber = mobileNumber;
    }
}
