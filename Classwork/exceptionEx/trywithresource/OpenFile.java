package exceptionEx.trywithresource;

import java.io.*;

public class OpenFile {
    public static void main(String[] args) {

        String fileName = "abc.xml";

//        if any class inherits Closeable or AutoCloseable interface
//        Then you can make try-with-resource.
//        like :- FileOutputStream, Connection etc.

        try(FileOutputStream fos = new FileOutputStream(fileName)){

            String name = "dsg";
            name.charAt(0); // NPE

        } catch (IOException e){
            e.printStackTrace();
        }

        // fis will be closed automatically
    }
}
