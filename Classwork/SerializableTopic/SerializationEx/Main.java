package SerializableTopic.SerializationEx;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SerializeMessage serializeMessage = new SerializeMessage();

        Message message = new Message("Hello from MD", "user1");

        serializeMessage.serializeMsg(message);
    }
}

// without implementing Serializable interface
// means you don't have permission to serialize this object and share among network, database or any file
// Exception in thread "main" java.io.NotSerializableException: SerializableTopic.SerializationEx.Message
