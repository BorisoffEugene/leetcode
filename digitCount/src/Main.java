public class Main {
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
        System.out.println(digitCount("030"));
    }

    public static boolean digitCount(String num) {
        int[] cnt = new int[10];
        int len = num.length();
        int dig;

        for (int i = 0; i < len; i++) {
            dig = num.charAt(i) - 48;
            cnt[i] += dig;
            cnt[dig]--;
        }

        for (int elm : cnt)
            if (elm != 0) return false;

        return true;
    }
}