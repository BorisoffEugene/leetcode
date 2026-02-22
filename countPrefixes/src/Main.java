public class Main {
    public static void main(String[] args) {
        System.out.println(countPrefixes(new String[] {"a","b","c","ab","bc","abc"}, "abc"));
        System.out.println(countPrefixes(new String[] {"a","a"}, "aa"));
    }

    public static int countPrefixes(String[] words, String s) {
        int res = 0;

        for (String word : words)
            if (s.indexOf(word) == 0) res++;

        return res;
    }
}