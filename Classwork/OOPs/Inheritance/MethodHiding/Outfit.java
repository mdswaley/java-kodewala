package OOPs.Inheritance.MethodHiding;

public class Outfit {
    public static void main(String[] args) {
        Foodware f = new MenFoodware();

        f.showDetails(); // method hiding

        C c = new C();
        c.show();
    }
}

class Foodware{
    int a; // both parent and child can have same name of the variable.
//    you can access it through object reference.

    public static void showDetails(){
        System.out.println("Foodware ShowDetails");
    }
}

class MenFoodware extends Foodware{
    int a;

    public static void showDetails(){
        System.out.println("MenFoodware ShowDetails");
    }
}

interface A{
    void show();
}

abstract class B implements A{
    @Override
    public void show(){
        System.out.println("Heello");
    }
}

class C extends B{

}
