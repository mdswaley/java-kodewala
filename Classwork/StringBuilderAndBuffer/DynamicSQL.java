package StringBuilderAndBuffer;

import java.util.Scanner;

public class DynamicSQL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Department : ");
        String department = sc.nextLine();

        System.out.println("Enter Salary : ");
        double salary = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter joining Date : ");
        String date = sc.nextLine();

        StringBuilder sb = new StringBuilder("SELECT * FROM EMPLOYEE WHERE 1=1");

        if (!department.isBlank()){
            sb.append(" AND department = '").append(department).append("'");
        }

        if (salary >= 50000){
            sb.append(" AND salary = ").append(salary);
        }

        if (!date.isBlank()){
            sb.append(" AND joiningDate = '").append(date).append("'");
        }

        System.out.println(sb);
        sc.close();
    }
}
