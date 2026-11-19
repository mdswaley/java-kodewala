package StaticAndInstanceBlock.Practice;

class Parent {
    static {
        System.out.println("Parent static");
    }

    {
        System.out.println("Parent instance");
    }

    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child static");
    }

    {
        System.out.println("Child instance");
    }

    Child() {
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
//       1st print parent static and child static. bcz jvm calls first when class is load
//       2nd parent instance then parent constructor
//       3rd child instance then child constructor
        new Child();

//       1st parent instance then parent constructor
//       2nd child instance then child constructor
        new Child();
    }
}
