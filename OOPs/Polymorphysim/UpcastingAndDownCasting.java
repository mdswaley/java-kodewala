package OOPs.Polymorphysim;

class UpcastingAndDownCasting {
    public static void main(String[] args) {
        User user = new User();

        User user1 = new Admin(); // parent class can refer by child class. auto up-casting

        Admin admin = (Admin) new User(); // child class is referring parent class. down-casting
    }
}

class User{

}

class Admin extends User{

}
class FinanceUser extends Admin{

}
