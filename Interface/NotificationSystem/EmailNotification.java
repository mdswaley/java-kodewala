package Interface.NotificationSystem;

// EmailNotification IS-A type of Notification
public class EmailNotification implements Notification{

    private final User user;

    EmailNotification(User user){ // email notification belong to User
        this.user = user;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending notification using Email to : "+user.getName());
    }
}
