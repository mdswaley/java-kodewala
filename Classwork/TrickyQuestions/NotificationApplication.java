package TrickyQuestions;

/**
 * understanding flow of override (sendNotification) not take email instance variable
 */

class NotificationService {
    NotificationService() {
        sendNotification();
    }

    void sendNotification() {
        System.out.println("Default Notification");
    }
}

/**
 * after NotificationService() constructor call sendNotification() directly jump to the override method print email,
 * but it not take value of email
 */
class EmailNotificationService extends NotificationService {
    String email = "admin@company.com";

    @Override
    void sendNotification() {
        System.out.println(email);
    }
}

public class NotificationApplication {
    public static void main(String[] args) {
        new EmailNotificationService();
    }
}
