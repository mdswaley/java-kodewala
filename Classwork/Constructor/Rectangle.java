package Constructor;

public class Rectangle {
    int length;
    int breadth;

    Rectangle(){
        System.out.println("Default constructor call...");
    }

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;

        System.out.println("Area of rectangle is : "+(this.length*this.breadth));
    }
}
