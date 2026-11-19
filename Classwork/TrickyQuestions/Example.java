package TrickyQuestions;

class Order {
    void process(long orderId) { // this is primitive type so process(100) give smaller data first
//        if you make long to Long (wrapper class) then it choose to Integer bcz Integer is smaller one for 100
        System.out.println("Long");
    }

    void process(Integer orderId) {
        System.out.println("Integer");
    }
}
public class Example{
    public static void main(String[] args) {
        Order processor = new Order();
        processor.process(100);
    }
}
