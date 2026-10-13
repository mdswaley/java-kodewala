package StaticAndInstanceBlock.Practice;

class EmployeeData {
    {
        System.out.println("Inside instance block");
    }

    EmployeeData(){
        System.out.println("no param constructor");
    }

    EmployeeData(String name){
        System.out.println("Param constructor");
    }
}

public class Employee{
    public static void main(String[] args) {
        new EmployeeData();
        new EmployeeData("Swaley");
    }
}

//O/P :-
//Inside instance block
//no param constructor
//Inside instance block
//Param constructor


