package SerializableTopic.SerializationEx;

import java.io.Serializable;

public class Message implements Serializable {
    private final static long serialVersionUID = 1L; // serialVersionUID is track every modification
//    after modification if you add seralVersionUID good to change number
//    so that when anyone de-serialize this object can use latest version of serialize object

    private String message;
    private String userName;

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
