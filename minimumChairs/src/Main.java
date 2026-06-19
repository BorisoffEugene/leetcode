public class Main {
    public static void main(String[] args) {
        System.out.println(minimumChairs("EEEEEEE"));
        System.out.println(minimumChairs("ELELEEL"));
        System.out.println(minimumChairs("ELEELEELLL"));
    }

    public static int minimumChairs(String s) {
        int res = 1;
        int cur = 0;
        char[] chars = s.toCharArray();

        for (char c : chars) {
            cur += c == 'E' ? 1 : -1;
            if (cur > res) res = cur;
        }

        return res;
    }
}