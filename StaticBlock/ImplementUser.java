package StaticBlock;

public class ImplementUser {
    public static void main(String[] args) {
        System.out.println("Main() start..");

//        Static block execute before User constructor call. And only once per class
        User u1 = new User("MD Swaley", "MD123", "349374720");
        User u2 = new User("Raaj", "raaj455", "4539729873");

        System.out.println("Main() end..");
    }
}
