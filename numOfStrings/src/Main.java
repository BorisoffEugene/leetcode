public class Main {
    public static void main(String[] args) {
        System.out.println(numOfStrings(new String[] {"a","abc","bc","d"}, "abc"));
        System.out.println(numOfStrings(new String[] {"a","b","c"}, "aaaaabbbbb"));
        System.out.println(numOfStrings(new String[] {"a","a","a"}, "ab"));
    }

    public static int numOfStrings(String[] patterns, String word) {
        int res = 0;

        for (String pattern : patterns)
            if (word.indexOf(pattern) != -1) res++;

        return res;
    }
}