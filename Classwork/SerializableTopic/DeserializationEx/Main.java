package SerializableTopic.DeserializationEx;

import SerializableTopic.SerializationEx.Message;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\mdswa\\Desktop\\KodeWala(Java)\\message.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Message message = (Message) ois.readObject();

        System.out.println(message.getMessage()+" from user : "+message.getUserName());
//        O/P:- Hello from MD from user : null
//        userName is null bcz at the time of serialization we make userName field to transient. means not going to share or serializable
//        for security purpose like password or any other sensitive value
    }
}
