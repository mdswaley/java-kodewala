package StringClass;

public class StringEquals {
    public static void main(String[] args) {
//        equals in Object class always check reference address same or not
//        equals in String class override Object class equals and give functionality to checking content.

        String city = "Bangalore";
        String city2 = "Bangalore";

        System.out.println(city.equals(city2));

        User user1 = new User("MD");
        User user2 = new User("MD");

//        it will give false bcz both have different reference. so address is also different.
//        And it uses Object class equals method
        System.out.println("Object class equals : "+user1.equals(user2));

//        here it will give true bcz user3 have user 1 object reference
        User user3 = user1;
        System.out.println(user3.equals(user1));

        User user4 = new User("MD");
        String name = "MD";

//
        System.out.println("check content : "+user4.equals(name));

        String ss = new String();
        String ss2 = new String();

        System.out.println("dknd :"+ss.equals(ss2));
    }
}

class User{
    String name;

    User(String name){
        this.name = name;
    }
}
