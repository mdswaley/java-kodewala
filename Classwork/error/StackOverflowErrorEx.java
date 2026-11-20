package error;

public class StackOverflowErrorEx {
    public static void main(String[] args) {
        StackOverflowErrorEx ex = new StackOverflowErrorEx();
        ex.m1();
    }

    public void m1(){
        System.out.println("m1");
        m2();
    }

    public void m2(){
        System.out.println("m2");
        m1();
    }
}

// After some number of times methods call each other (around 1000 times)
// JVM is close the application with StackOverflowError throw.
// bcz the memory don't have enough space. Stack is full of recursive calls of methods.
