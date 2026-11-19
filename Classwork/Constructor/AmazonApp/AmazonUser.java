package Constructor.AmazonApp;

// this is amazon user class
public class AmazonUser {

    String userId;
    String name;
    String role;
    String country;

    AmazonUser(String userId, String name, String role, String country){
        this.userId = userId;
        this.name = name;
        this.role = role;
        this.country = country;
    }

    AmazonUser(){
        this("user@123", "user_default", "user", "IN");
    }
}
