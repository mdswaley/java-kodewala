package OOPs.Inheritance.ConstructorExcutingOrder;

class Parent {
    Parent(){ // so control come here and print parent constructor
        System.out.println("Parent Constructor call...");
    }
}

class Child extends Parent{
    Child(){ // first control come here and first keyword/method for every constructor would be super() with no arg
        System.out.println("Child Constructor call...");
    }
}

class Main{
    public static void main(String[] args) {
        Child child = new Child();
    }
}

//class Parent {
//    int x = 10;
//}
//
//class Child extends Parent {
//    int x = 20;
//
//    void display() {
//        System.out.println(x);
//        System.out.println(super.x);
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        new Child().display();
//    }
//}
