package ControlFlow.SwitchCase;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        checkChar(ch);
    }

    private static void checkChar(char ch){
        switch (ch){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Vowels...");
                break;
            default:
                System.out.println("Consonant...");
                break;
        }
    }
}
