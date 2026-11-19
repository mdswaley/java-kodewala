package exceptionEx.throwandthrows.userdefineException;

public class FundTransferException extends RuntimeException {

    public static final long serialVersionUID = 1L; // purpose of serialVersionUID. This exception can throw to the caller method.
    // And there is possible that method is in different system. so need to serialize the object. So that it can share

    public FundTransferException(String message) {
        super(message);
    }
}
