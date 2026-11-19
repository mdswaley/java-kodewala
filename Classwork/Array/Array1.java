package Array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] employeeId = new int[5];

        employeeId[0] = 21;
        employeeId[1] = 34;
        employeeId[2] = 9;
        employeeId[3] = 65;
        employeeId[4] = 43;

        System.out.println(employeeId[3]);
        System.out.println(Arrays.toString(employeeId));
    }
}
