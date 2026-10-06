package ControlFlow.SwitchCase;

public class NumberToWord {
    public static void main(String[] args) {
        String res = convertNumberToWord(3);

        System.out.println(res);
    }

    private static String convertNumberToWord(int num) {
        String word = "";

        switch (num) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;

            default:
                System.out.println("Invalid input...");
                break;
        }

        return word;
    }
}
