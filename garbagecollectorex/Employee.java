package garbagecollectorex;

public class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void details(){
        System.out.println("Employee name is :"+name+" age is : "+age);
    }
}
