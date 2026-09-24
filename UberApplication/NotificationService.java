package UberApplication;

public class NotificationService {
    public void sendNotification(String type){
        System.out.println("NotificationService.sendNotification()");

        if(type.equalsIgnoreCase("sms")){
            sms();
        }else if(type.equalsIgnoreCase("email")){
            email();
        }else{
            whatsapp();
        }
    }

    public void sms(){
        System.out.println("Start sms...");
        System.out.println("End sms...");
    }

    public void email(){
        System.out.println("Start email...");
        System.out.println("End email...");
    }

    public void whatsapp(){
        System.out.println("Start whatsapp");
        System.out.println("End whatsapp");
    }
}
