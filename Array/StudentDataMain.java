package Array;

public class StudentDataMain {
    public static void main(String[] args) {
        StudentData student1 = new StudentData(1, "MD");
        StudentData student2 = new StudentData(2, "Raj");
        StudentData student3 = new StudentData(3, "Priya");
        StudentData student4 = new StudentData(4, "Neha");
        StudentData student5 = new StudentData(5, "Arjun");

        StudentData[] studentData = {student1, student2, student3, student4, student5};

        System.out.println(studentData);
    }
}
