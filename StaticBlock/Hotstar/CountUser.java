package StaticBlock.Hotstar;

public class CountUser {
    String userId;
    String userName;
    String type;
    public static int liveUserCount;

    public CountUser(String userId, String userName, String type){
        super();
        this.userId = userId;
        this.userName = userName;
        this.type = type;
    }

    public CountUser(String userName, String type){
        super();
        this.userName = userName;
        this.type = type;
    }

//    we can do this in constructor but constructor is not for business logic.
//    And suppose in future another developer create another constructor and forgotten to increate count then there will be issue.
    {
        liveUserCount++;
    }


}
