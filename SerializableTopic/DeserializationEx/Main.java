package SerializableTopic.DeserializationEx;

import SerializableTopic.SerializationEx.Message;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\mdswa\\Desktop\\KodeWala(Java)\\message.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Message message = (Message) ois.readObject();

        System.out.println(message.getMessage());
    }
}
