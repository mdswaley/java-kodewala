package com.Interface.NotificationSystem;

// whatsappNotification IS-A type of Notification
public class WhatsappNotification implements Notification{

    private final User user;

    WhatsappNotification(User user) { // whatsapp notification belong to User
        this.user = user;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending notification using whatsapp to : "+user.getName());
    }
}
