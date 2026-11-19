package AccessModifier;

public class GetEmployee {
    public static void main(String[] args) {
        EmployeeData e1 = new EmployeeData();

        e1.printEmp();

        System.out.println("Printing employee details in main()...");
    }
}
