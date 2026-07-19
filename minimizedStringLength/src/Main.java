public class Main {
    public static void main(String[] args) {
        System.out.println(minimizedStringLength("aaabc"));
        System.out.println(minimizedStringLength("cbbd"));
        System.out.println(minimizedStringLength("baadccab"));
    }

    public static int minimizedStringLength(String s) {
        boolean[] check = new boolean[26];
        char[] chars = s.toCharArray();
        int res = 0;

        for (char c : chars)
            if (!check[c - 'a']) {
                res++;
                check[c - 'a'] = true;
            }

        return res;
    }
}