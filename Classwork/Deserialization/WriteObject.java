package Deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student(1, "MD");

        FileOutputStream fos = new FileOutputStream("student.txt"); // java checks whether
        // student.txt is existed or not if no then create or else override the existing file to the current content.
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);

        fos.close();
        oos.close();
    }
}
