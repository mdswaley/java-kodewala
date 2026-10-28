package Interface.NotificationSystem;

public class EmailNotification implements Notification{

    private final User user;

    EmailNotification(User user){
        this.user = user;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending notification using Email to : "+user.getName());
    }
}
