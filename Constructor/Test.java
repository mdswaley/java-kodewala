package Constructor;

class Student1{
    int id;
    String name;
}

public class Test {
    public static void main(String[] args) {
        Student1 s = new Student1();
        System.out.println(s.id);
        System.out.println(s.name);
    }
}
