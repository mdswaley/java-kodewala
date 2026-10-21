package OOPs.OverridingAndOverloading;

class EmployeeSalary {
    double calculateSalary(double basic){
        return basic;
    }

    double calculateSalary(double basic, double bonus){
        return basic + bonus;
    }
}

class ManagerSalary extends EmployeeSalary{
    @Override
    double calculateSalary(double basic){
        return basic + (basic * 0.10); // 10% allowance
    }

    @Override
    double calculateSalary(double basic, double bonus){
        return basic + (basic * 0.10) + bonus; // 10% allowance + bonus
    }
}

class Main{
    public static void main(String[] args) {
        EmployeeSalary employeeSalary = new ManagerSalary();

        System.out.println("Salary without bonus : "+employeeSalary.calculateSalary(50000));
        System.out.println("Salary with bonus : "+employeeSalary.calculateSalary(45000, 2000));
    }
}
