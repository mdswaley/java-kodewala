package Constructor;

public class ConstructorHierarchy {
    public static void main(String[] args) {
        C c = new C();

//        output :-
//        1. A Constructor
//        2. B Constructor
//        3. C Constructor

        /*
        new C()
           ↓
            C()
            ↓
            super() → B()
                        ↓
                        super() → A()
                                    ↓
                                    A Constructor
                                        ↓
                                    B Constructor
                                         ↓
                                    C Constructor*/
    }
}

class A{
    A(){
        System.out.println("A Constructor call...");
    }
}
class B extends A{
    B(){
        System.out.println("B Constructor call...");
    }
}

class C extends B{
    C(){
        System.out.println("C Constructor call...");
    }
}
