package SerializableTopic.StudentManagementSystem.util;

import SerializableTopic.StudentManagementSystem.model.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileUtil {
    public static void saveStudent(List<Student> studentList) throws IOException {
        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(studentList);
        System.out.println("Student saved successfully.");
    }
}
