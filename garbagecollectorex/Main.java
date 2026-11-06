package garbagecollectorex;

public class Main {
//    we make it instance level
//    bcz if we add in method then after method call is done it will go
    Employee employee;

    public void doSomething() {
        employee = new Employee("MD", 23);

        employee.details();

//        500 lines of code...

//        suppose after line number 9 --> employee.details();
//        we don't need employee object
//        so we can make it null. so that garbage collector can clean the heap memory


//        if we not make it null then there may be chance of outOfMemory error
//        bcz gc will never remove objects till the reference is null

        employee = null;

    }
}
