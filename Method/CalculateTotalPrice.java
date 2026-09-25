package Method;

class Items{
    String itemName;
    double price;

    Items(String itemName, double price){
        this.itemName = itemName;
        this.price = price;
    }
}

class User {
    String userName;
    int count;
    Items[] items;

    User(String userName, int size){
        this.userName = userName;
        this.items = new Items[size];
    }

    void addItems(Items item){
        items[count] = item;
        count++;
    }

    double totalPrice(){
        double total = 0;

        for(int i=0;i<count;i++){
            total += items[i].price;
        }

        return total;
    }
}

public class CalculateTotalPrice {
    public static void main(String[] args) {

        User u1 = new User("Swaley", 3);

        u1.addItems(new Items("TShirt", 530));
        u1.addItems(new Items("Jeans", 1200));
        u1.addItems(new Items("Shoes", 2000));

        System.out.println("Total price for user : "+u1.userName+" is : "+u1.totalPrice());

    }

}
