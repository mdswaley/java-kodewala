package Operators;

public class AndOrOperator {
    public static void main(String[] args) {
        String carName = args[0];

        int minLen = 3;
        int maxLen = 10;

        System.out.println("Condition 1 : "+ (carName.length() > minLen));

        System.out.println("Condition 2 : "+ (carName.length() <= maxLen));

        System.out.println("OverAll Conditions : "+ ((carName.length() > minLen) || (carName.length() <= maxLen)));

    }
}
