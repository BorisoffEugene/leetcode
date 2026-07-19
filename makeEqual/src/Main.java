public class Main {
    public static void main(String[] args) {
        System.out.println(makeEqual(new String[] {"abc","aabc","bc"}));
        System.out.println(makeEqual(new String[] {"ab","a"}));
    }

    public static boolean makeEqual(String[] words) {
        int[] freq = new int[26];
        char[] chars;
        int len = words.length;

        for (String word : words) {
            chars = word.toCharArray();
            for (char c : chars)
                freq[c - 'a']++;
        }

        for (int f : freq)
            if (f % len != 0) return false;

        return true;
    }
}