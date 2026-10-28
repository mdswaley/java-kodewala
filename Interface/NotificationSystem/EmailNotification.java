package Interface.NotificationSystem;

public class EmailNotification extends User implements Notification{
    EmailNotification(String name) {
        super(name);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending notification using Email to : "+this.name);
    }
}
