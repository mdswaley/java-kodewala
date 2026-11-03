package SerializableTopic;

import SerializableTopic.StudentManagementSystem.model.Student;
import SerializableTopic.StudentManagementSystem.service.StudentService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student(1l, "MD", "Java", "ABC492382");

        StudentService service = new StudentService();
        service.addStudent(student);

        service.saveStudents();

        service.loadStudents();

        service.viewStudents();

    }
}
