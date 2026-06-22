public class Main {
    public static void main(String[] args) {
        System.out.println(residuePrefixes("abc"));
        System.out.println(residuePrefixes("dd"));
        System.out.println(residuePrefixes("bob"));
    }

    public static int residuePrefixes(String s) {
        boolean[] check = new boolean[26];
        char[] chars = s.toCharArray();
        int cnt = 0;
        int len = 0;
        int res = 0;

        for (char c : chars) {
            if (!check[c - 'a']) {
                check[c - 'a'] = true;
                cnt++;
            }

            len++;

            if (cnt == len % 3) res++;
        }

        return res;
    }
}