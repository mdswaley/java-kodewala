package OOPs.Inheritance.AccessingParentProperties;

class Parent {
    String name;
    int age;

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
}

class Child extends Parent{
    double salary;

    double getSalary(){
        return salary;
    }
}

class Main{
    public static void main(String[] args) {
        Child child = new Child();

        child.name = "Swaley";
        child.age = 23;
        child.salary = 76000;

        System.out.println("Name of the person : "+child.getName());
        System.out.println("Age : "+child.getAge());
        System.out.println("Salary : "+child.getSalary());

    }
}
