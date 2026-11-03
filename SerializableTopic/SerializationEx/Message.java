package SerializableTopic.SerializationEx;

import java.io.Serializable;

public class Message implements Serializable {
    private final static long serialVersionUID = 1L; // serialVersionUID is track every modification
//    after modification if you add seralVersionUID good to change number
//    so that when anyone de-serialize this object can use latest version of serialize object

//    if you change UID and not execute Serialized --> Main class then you file message.ser still have older value
//    so while de-serialization it throw Exception in thread "main" java.io.InvalidClassException:
//    SerializableTopic.SerializationEx.Message; local class incompatible: stream class desc serialVersionUID = 1, local class serialVersionUID = 2

    private String message;
    private transient String userName;  // transient means skip the serialize process. means userName is not going to share with others

    Message(String message, String userName){
        this.message = message;
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
