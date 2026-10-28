package Interface.NotificationSystem;

public class LinkedInNotification implements Notification{

    private final User user;

    LinkedInNotification(User user) {
        this.user = user;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending notification using LinkedIn to : "+user.getName());
    }
}
