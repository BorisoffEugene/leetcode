import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[] {"gin","zen","gig","msg"}));
        System.out.println(uniqueMorseRepresentations(new String[] {"a"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        final String[] MORSE_WORDS = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();

        for (String word : words)
            set.add(morseWord(word, MORSE_WORDS));

        return set.size();
    }

    public static String morseWord(String word, String[] morseWords) {
        char[] arr = word.toCharArray();
        String res = "";

        for (char elm : arr) {
            res += morseWords[elm - 97];
        }

        return res;
    }
}