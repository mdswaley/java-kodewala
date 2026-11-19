package OOPs.Encaptulation.SimpleCode;

class Employee {
    private String empID;
    private String empName;

    public void setEmpID(String empId){
        this.empID = empId;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public String getEmpID(){
        return empID;
    }

    public String getEmpName(){
        return empName;
    }
}

class Main{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpID("EMP4231");
        employee.setEmpName("Swaley");

        System.out.println("Employee ID : "+employee.getEmpID());
        System.out.println("Employee Name : "+employee.getEmpName());
    }
}
