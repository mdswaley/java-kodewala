package com.shallowCloning;

public class Employee implements Cloneable{ // Level - 1 copy
    String name;
    String empCode;
    Address address;  // HAS-A // copy only reference not object

    public Employee(String name, String empCode, Address address) {
        this.name = name;
        this.empCode = empCode;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
