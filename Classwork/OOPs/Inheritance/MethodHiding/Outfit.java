package OOPs.Inheritance.MethodHiding;

public class Outfit {
    public static void main(String[] args) {
        Foodware f = new MenFoodware();

        f.showDetails(); // method hiding
    }
}

class Foodware{
    public static void showDetails(){
        System.out.println("Foodware ShowDetails");
    }
}

class MenFoodware extends Foodware{
    public static void showDetails(){
        System.out.println("MenFoodware ShowDetails");
    }
}
