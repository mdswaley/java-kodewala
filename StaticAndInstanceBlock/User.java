package StaticAndInstanceBlock;

class User {
    String userName;
    String userId;
    String mobileNumber;

//    if you have multiple static block execute sequentially
    static {
        System.out.println("Inside static block1. It will execute only once...");
    }

    static {
        System.out.println("Inside static block2. It will execute only once...");
    }

    static {
        System.out.println("Inside static block3. It will execute only once...");
    }


    User(String userName, String userId, String mobileNumber){
        super(); // by default every constructor first line is either super() or this
        System.out.println("Inside User constructor for "+userName);
        this.userName = userName;
        this.userId = userId;
        this.mobileNumber = mobileNumber;
    }
}
