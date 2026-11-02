package com.Interface.Interface8.MarkerInterface.EmployeeBenefit;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Manager("Swaley");
        Employee employee1 = new Developer("Raaj");

        specialBenefit(employee);
        specialBenefit(employee1);
    }

    static void specialBenefit(Employee employee){
        if (employee instanceof SpecialBenefits){
            System.out.println("Employee : "+employee.name+" is eligible for special benefits.");
        }else{
            System.out.println("Employee : "+employee.name+" is not eligible for special benefits.");
        }
    }
}
