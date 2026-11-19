package com.shallowCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("BTM", "Stage 1", "Bangalore");
        Employee emp = new Employee("MD", "EMP123", address);

        Employee cloneEmp = (Employee) emp.clone();

        emp.address.city = "Hyd";

        System.out.println(emp.address.city);
        System.out.println(cloneEmp.address.city);
    }
}

// shallow copy means copy only the first level of object
// like in our case we have Employee class having name, empCode and address
// but shallow copy will copy the object till empCode not address
// bcz Address is a nested object
// so only reference copy for address
// means previous address and copy address both pointing to the same location in heap
