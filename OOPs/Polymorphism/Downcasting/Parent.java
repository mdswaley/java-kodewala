package OOPs.Polymorphism.Downcasting;

import java.awt.*;

class Parent {
    void display(){
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("Child class");
    }
}

class Main2{
    public static void main(String[] args) {
        Parent parent = new Parent(); // The actual object is a Parent, not a Child.

        parent.display();

        Child child = (Child) parent; // Runtime exception:- Exception in thread "main" java.lang.ClassCastException
//        Why ?
//        Remember: An explicit cast does not transform a parent object into a child object.
    }
}
