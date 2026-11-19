package DataTypes;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String sms){
        super(sms);
    }
}
