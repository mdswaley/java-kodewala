package OOPs.Polymorphism.Upcasting;

class DeliveryPartner {
    void deliveryOrder(){
        System.out.println("Delivery Partner class called..");
    }
}

class BikeDelivery extends DeliveryPartner{
    @Override
    void deliveryOrder(){
        System.out.println("Bike Delivery Partner class called..");
    }
}

class EVDelivery extends DeliveryPartner{
    @Override
    void deliveryOrder(){
        System.out.println("EV Delivery Partner class called..");
    }
}

class ScottyDelivery extends DeliveryPartner{
    @Override
    void deliveryOrder(){
        System.out.println("Scotty Delivery Partner class called..");
    }
}

class Main2{
    public static void main(String[] args) {
        DeliveryPartner obj = new BikeDelivery();
        obj.deliveryOrder();

        obj = new EVDelivery();
        obj.deliveryOrder();

        obj = new ScottyDelivery();
        obj.deliveryOrder();
    }
}
