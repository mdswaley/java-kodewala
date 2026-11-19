package Deserialization;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("student.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s2 = (Student) ois.readObject();

        System.out.println(s2);

        fis.close();
        ois.close();
    }
}
