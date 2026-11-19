package StringClass.Basics;

public class CountVowelAndConsonant {
    public static void main(String[] args) {
        String s = args[0].toLowerCase();
        count(s);
    }

    private static void count(String s){
        int vowel = 0;
        int consonant = 0;

        for (char ch:s.toCharArray()){
            if (ch == ' ') continue;

            if (isVowel(ch)){
                vowel++;
            }else {
                consonant++;
            }
        }

        System.out.println("Number of vowels : "+vowel);
        System.out.println("Number of consonant : "+consonant);
    }

    private static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
