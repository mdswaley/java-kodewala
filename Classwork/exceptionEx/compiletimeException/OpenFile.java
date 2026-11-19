package exceptionEx.compiletimeException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OpenFile {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\mdswa\\Desktop\\KodeWala(Java)\\ControlFlow\\CabFare\\CabFareCalculatorMain.java";

        FileInputStream fis = null;

        try{
            fis = new FileInputStream(filePath);
            System.out.println("open file successfully..");
        }
        catch (FileNotFoundException e){
            System.out.println("file doesn't exist..");
        }
        finally {
            fis.close();
        }
    }
}
