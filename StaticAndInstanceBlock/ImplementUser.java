package StaticAndInstanceBlock;

public class ImplementUser {
    public static void main(String[] args) {
        System.out.println("Main() start..");

//        Static block execute before User constructor call. And only once per class
//        Note :- if you are using static block inside main class then it will execute before main() call
        User u1 = new User("MD Swaley", "MD123", "349374720");
        User u2 = new User("Raaj", "raaj455", "4539729873");

//        Account acc = new Account("9847383478");
//        Account acc2 = new Account("389834987");

        System.out.println("Main() end..");
    }
}
