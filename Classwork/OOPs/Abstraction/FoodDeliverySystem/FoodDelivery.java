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

    private boolean confirmOrder(){
        System.out.println("Order is confirm");
        return true;
    }

    private String assignDeliveryPartner(){
        System.out.println("Assigning Delivery partner");
        return "Raaj";
    }

    private void trackLocation(){
        System.out.println("Tracking location");
    }
}

class Main{
    public static void main(String[] args) {
        FoodDelivery foodDelivery = new FoodDelivery();
        foodDelivery.deliveryOrder();
    }
}


