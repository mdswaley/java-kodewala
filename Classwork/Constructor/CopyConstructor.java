package Constructor;

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Swaley", 68.54);

        Student s2 = new Student(s1);

        System.out.println("Actual student data : ");
        System.out.println(s1);

        System.out.println("\nCopy student data : ");
        System.out.println(s2);
    }
}

class Student{
    int id;
    String name;
    double mark;

    Student(int id, String name, double mark){
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    Student(Student s1){
        this.id = s1.id;
        this.name = s1.name;
        this.mark = s1.mark;
    }

    @Override
    public String toString(){
        return "Student id : "+id+" name : "+name+" mark : "+mark;
    }
}
