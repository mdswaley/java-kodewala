package SerializableTopic.StudentManagementSystem.util;

import SerializableTopic.StudentManagementSystem.model.Student;

import java.io.*;
import java.util.List;

public class FileUtil {
    public static void saveStudent(List<Student> studentList) throws IOException {
        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(studentList);
        System.out.println("Student saved successfully.");
    }

    public static List<Student> loadStudents() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\mdswa\\Desktop\\KodeWala(Java)\\student.ser");
        ObjectInputStream oos = new ObjectInputStream(fis);

        List<Student> res = (List<Student>) oos.readObject();

        return res;
    }
}
