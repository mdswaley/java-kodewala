package OOPs.Abstraction;

public class OrderPlace {
    private String userName;
    private String orderName;
    private String orderID;
    private String address;


    public boolean placeOrder(String userName, String orderID, String orderName, String address){
        connectWithDatabase();
        validateAddress(address);
        checkOrderAvailability(orderID, orderName);
        sendNotification(userName);

        return true;
    }

    private void connectWithDatabase(){
        System.out.println("Connecting with database...");
    }

    private void checkOrderAvailability(String orderID, String orderName){
        System.out.println("Checking availability of ID : "+orderID+" and name : "+orderName);
    }

    private void validateAddress(String address){
        System.out.println("validate address of user : "+address);
    }

    private void sendNotification(String userName){
        System.out.println("send notification via email or sms to : "+userName);
    }

}
