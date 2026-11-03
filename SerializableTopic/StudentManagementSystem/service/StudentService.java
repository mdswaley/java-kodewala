package SerializableTopic.StudentManagementSystem.service;

import SerializableTopic.StudentManagementSystem.model.Student;
import SerializableTopic.StudentManagementSystem.util.FileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    // Add Student
    public void addStudent(Student student) {

        students.add(student);

        System.out.println("Student added successfully!");
    }

    // View All Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Update Student
    public void updateStudent(int id, String name, String course) {

        for (Student student : students) {

            if (student.getId() == id) {

                student.setStudentName(name);
                student.setCourse(course);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    // Delete Student
    public void deleteStudent(int id) {

        boolean removed = students.removeIf(student -> student.getId() == id);

        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // Save Students - Serialization
    public void saveStudents() throws IOException {
        FileUtil.saveStudent(students);
    }

    // Load Students - Deserialization
    public void loadStudents() throws IOException, ClassNotFoundException {

        students = FileUtil.loadStudents();

        System.out.println("Student records loaded successfully!");
    }
}
