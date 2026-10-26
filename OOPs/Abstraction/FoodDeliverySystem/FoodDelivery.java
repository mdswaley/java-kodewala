package OOPs.Abstraction.FoodDeliverySystem;

class FoodDelivery {
    private Long amount;

    void deliveryOrder(){
        boolean res = confirmOrder();
        String name = assignDeliveryPartner();

        if(res && Character.isUpperCase(name.charAt(0))){
            trackLocation();
        }
    }

    boolean confirmOrder(){
        System.out.println("Order is confirm");
        return true;
    }

    String assignDeliveryPartner(){
        System.out.println("Assigning Delivery partner");
        return "Raaj";
    }

    void trackLocation(){
        System.out.println("Tracking location");
    }
}


