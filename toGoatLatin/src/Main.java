public class Main {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

    public static String toGoatLatin(String sentence) {
        String res = "";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++)
            res += convertWord(words[i], i) + ((i < words.length - 1) ? " " : "");

        return res;
    }

    public static String convertWord(String word, int i) {
        String res = "";
        char firstChar = word.charAt(0);

        if ("aeiou".indexOf(Character.toLowerCase(firstChar)) == -1)
            res = word.substring(1) + firstChar + "ma";
        else
            res = word + "ma";

        res += "a".repeat(i + 1);

        return res;
    }
}