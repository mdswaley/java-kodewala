package Interface.NotificationSystem;

public class WhatsappNotification extends User implements Notification{
    WhatsappNotification(String name) {
        super(name);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending notification using whatsapp to : "+this.name);
    }
}
