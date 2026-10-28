package Interface.NotificationSystem;

public class LinkedInNotification extends User implements Notification{
    LinkedInNotification(String name) {
        super(name);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending notification using LinkedIn to : "+this.name);
    }
}
