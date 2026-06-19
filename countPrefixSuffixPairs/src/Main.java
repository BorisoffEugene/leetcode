public class Main {
    public static void main(String[] args) {
        System.out.println(countPrefixSuffixPairs(new String[] {"a","aba","ababa","aa"}));
        System.out.println(countPrefixSuffixPairs(new String[] {"pa","papa","ma","mama"}));
        System.out.println(countPrefixSuffixPairs(new String[] {"abab","ab"}));
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int res = 0;
        int len;

        for (int i = 0; i < words.length - 1; i++) {
            len = words[i].length();
            for (int j = i + 1; j < words.length; j++)
                if (words[j].indexOf(words[i]) == 0 && words[j].lastIndexOf(words[i]) == words[j].length() - len)
                    res++;
        }

        return res;
    }
}