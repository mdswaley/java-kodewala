package com.Interface.NotificationSystem;

// LinkedInNotification IS-A type of Notification
public class LinkedInNotification implements Notification{

    private final User user;

    LinkedInNotification(User user) { // LinkedIn notification belong to User
        this.user = user;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending notification using LinkedIn to : "+user.getName());
    }
}
