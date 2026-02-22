public class Main {
    public static void main(String[] args) {
        System.out.println(secondHighest("sjhtz8344"));
        System.out.println(secondHighest("abc1111"));
    }

    public static int secondHighest(String s) {
        int max = 47;
        int res = 47;
        int len = s.length();

        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (48 > c || c > 57) continue;
            if (c > max) {
                res = max;
                max = c;
            } else if (c > res && c != max) {
                res = c;
            }
        }

        return res - 48;
    }
}