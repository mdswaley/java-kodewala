package Interface.NotificationSystem;

public class WhatsappNotification implements Notification{

    private final User user;

    WhatsappNotification(User user) {
        this.user = user;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending notification using whatsapp to : "+user.getName());
    }
}
