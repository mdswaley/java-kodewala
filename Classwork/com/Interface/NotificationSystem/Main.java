package com.Interface.NotificationSystem;

public class Main {
    public static void main(String[] args) {
        Notification notification = new EmailNotification(new User("MD Swaley"));
        notification.sendNotification();

        Notification notification1 = new LinkedInNotification(new User("Raaj"));
        notification1.sendNotification();

        Notification notification2 = new LinkedInNotification(new User("Sonu"));
        notification2.sendNotification();
    }
}
