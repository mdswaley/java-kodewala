package SerializableTopic;

import SerializableTopic.StudentManagementSystem.model.Student;
import SerializableTopic.StudentManagementSystem.service.StudentService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StudentService service = new StudentService();

        service.loadStudents();

        Student student = new Student(1L, "MD", "Java", "ABC492382");

        service.addStudent(student);

        service.saveStudents();

        service.viewStudents();

        service.updateStudent(1L, "aley", "Python");

        service.saveStudents();

//        service.loadStudents();

//        service.viewStudents();

    }
}
