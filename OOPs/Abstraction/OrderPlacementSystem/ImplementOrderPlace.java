package OOPs.Abstraction.OrderPlacementSystem;

public class ImplementOrderPlace {
    public static void main(String[] args) {
        OrderPlace orderPlace = new OrderPlace();
        orderPlace.placeOrder("Raaj","ORD323", "Shirt", "BTM Layout, Bangalore");

//        if we make core functionality public then we are not achieve abstraction
//        so for that abstraction need to make core functionality to private. so that other class couldn't access it
    }
}
