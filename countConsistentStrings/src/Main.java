public class Main {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[] {"ad","bd","aaab","baa","badab"}));
        System.out.println(countConsistentStrings("abc", new String[] {"a","b","c","ab","ac","bc","abc"}));
        System.out.println(countConsistentStrings("cad", new String[] {"cc","acd","b","ba","bac","bad","ac","d"}));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        boolean[] exists = new boolean[26];
        char[] alloweds = allowed.toCharArray();
        char[] wordChars;
        int res = words.length;

        for(char c: alloweds)
            exists[c - 'a'] = true;

        for (String word : words) {
            wordChars = word.toCharArray();
            for(char c : wordChars)
                if (!exists[c - 'a']) {
                   res--;
                   break;
                }
        }

        return res;
    }
}