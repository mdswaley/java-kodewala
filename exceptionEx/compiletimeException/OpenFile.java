package exceptionEx.compiletimeException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpenFile {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\mdswa\\Desktop\\KodeWala(Java)\\ControlFlow\\CabFare\\CabFareCalculatorMain.java";

        try{
            FileInputStream fis = new FileInputStream(filePath);
            System.out.println("open file successfully..");
        }
        catch (FileNotFoundException e){
            System.out.println("file doesn't exist..");
        }
    }
}
