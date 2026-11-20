package exceptionEx.finallyBlockEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException
    {
        String fileName = "Example.txt";

//        try-with-resource
        try (FileOutputStream fos = new FileOutputStream(fileName)){


        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
