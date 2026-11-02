package com.Interface.Interface8.MarkerInterface.EmployeeBenefit;

public class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }
}

class Manager extends Employee implements SpecialBenefits{
    Manager(String name) {
        super(name);
    }
}

class Developer extends Employee{
    Developer(String name){
        super(name);
    }
}
