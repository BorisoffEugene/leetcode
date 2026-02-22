public class Main {
    public static void main(String[] args) {
        System.out.println(getLucky("skmgsaqwjkzrxufklvqarkejpshc", 10));
    }

    public static int getLucky(String s, int k) {
        char[] chars = s.toCharArray();

        int res = 0;
        int tmp;
        for (char c : chars)
            res += charToInt(c);

        k--;
        while (res > 1 && k > 0) {
            tmp = res;
            res = 0;
            while (tmp > 0) {
                res += tmp % 10;
                tmp /= 10;
            }

            k--;
        }

        return res;
    }

    public static int charToInt(char c) {
        if (c < 'j') return c - '`';
        if (c < 't') return c - '`' - 10 + 1;
        return c - '`' - 20 + 2;
    }
}