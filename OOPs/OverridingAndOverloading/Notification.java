package OOPs.OverridingAndOverloading;

class Notification {
    void send(String message){
        System.out.println("Sending notification : "+message);
    }

    void send(String message, String recipient){
        System.out.println("Sending notification to "+recipient+" : "+message);
    }
}

class EmailNotification extends Notification{
    @Override
    void send(String message){
        System.out.println("Sending email notification : "+message);
    }

    @Override
    void send(String message, String recipient){
        System.out.println("Sending email notification to : "+recipient+" : "+message);
    }
}

class Main2{
    public static void main(String[] args) {
        Notification notification = new EmailNotification();

        notification.send("Hello World!");
        notification.send("Hii Swaley.", "md@gamil.com");
    }
}