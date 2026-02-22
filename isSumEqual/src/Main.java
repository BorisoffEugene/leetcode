public class Main {
    public static void main(String[] args) {
        System.out.println(isSumEqual("acb", "cba", "cdb"));
        System.out.println(isSumEqual("aaa", "a", "aab"));
        System.out.println(isSumEqual("aaa", "a", "aaaa"));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return convert(firstWord) + convert(secondWord) == convert(targetWord);
    }

    public static int convert(String word) {
        int len = word.length() - 1;
        int res = 0;

        for (int i = len, ten = 1; i >= 0; i--, ten *= 10)
            res += (word.charAt(i) - 'a') * ten;

        return res;
    }
}