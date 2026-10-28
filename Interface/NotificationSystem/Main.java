package Interface.NotificationSystem;

public class Main {
    public static void main(String[] args) {
        Notification notification = new EmailNotification("MD Swaley");
        notification.sendNotification();

        Notification notification1 = new LinkedInNotification("Raaj");
        notification1.sendNotification();

        Notification notification2 = new LinkedInNotification("Sonu");
        notification2.sendNotification();
    }
}
