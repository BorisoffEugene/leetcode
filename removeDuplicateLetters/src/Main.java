public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("bcabc"));
        System.out.println(removeDuplicateLetters("acdb"));
    }

    public static String removeDuplicateLetters(String s) {
        char[] chars = s.toCharArray();
        boolean[] exists = new boolean[26];

        for (char c : chars)
            exists[c - 'a'] = true;

        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++)
            if (exists[c - 'a']) sb.append(c);

        return sb.toString();
    }
}