package com.deepCloning;


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
