package OOPs.Polymorphism.SimpleCode;

class Delivery {
    public void doDelivery(){
        System.out.println("Delivery.doDelivery...");
    }
}

class ExpressBee extends Delivery{
    @Override
    public void doDelivery(){
        System.out.println("ExpressBee.doDelivery...");
    }
}

class EKart extends Delivery{
    @Override
    public void doDelivery(){
        System.out.println("EKart.doDelivery...");
    }
}

class Main{
    public static void main(String[] args) {
        Delivery delivery = new Delivery();

//        Compile time it check whether method exist in delivery class or not if not then check super class or super-super class
//        Runtime it will check object type according to that it will decide which method to call.
        delivery.doDelivery();

//        Parent class can refer child class object
        Delivery delivery1 = new ExpressBee(); // up-casting
//        compile -> it will check the method in delivery class
//        runtime -> it will check the method of ExpressBee class
        delivery1.doDelivery();


        Delivery del = new ExpressBee();
        ExpressBee expressBee = (ExpressBee) del; // down-casting
        expressBee.doDelivery();

//        java.lang.ClassCastException :- Runtime exception



    }
}
