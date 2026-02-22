public class Main {
    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world", "ad"));
        System.out.println(canBeTypedWords("leet code", "lt"));
        System.out.println(canBeTypedWords("leet code", "e"));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        int[] blArr = new int[26];
        int len = brokenLetters.length();
        for (int i = 0; i < len; i++)
            blArr[brokenLetters.charAt(i) - 97] = -1;

        String[] words = text.split(" ");
        int res = 0;
        for (String word : words)
            if (checkWord(word, blArr)) res++;

        return res;
    }

    public static boolean checkWord(String word, int[] blArr) {
        int len = word.length();
        for (int i = 0; i < len; i++)
            if (blArr[word.charAt(i) - 97] == -1) return false;

        return true;
    }
}