package com.deepCloning;


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
        // Creates a new Employee object with copied field values.
        // At this point, both Employee objects share the same Address reference.
        Employee employee = (Employee) super.clone();

        // Create a NEW Address object instead of sharing the original reference.
        // Copy the values of line1, line2 and city into the new Address object.
        employee.address = new Address(this.address.line1, this.address.line2, this.address.city);

        return employee;
    }
}
