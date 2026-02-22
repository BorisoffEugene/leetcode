public class Main {
    public static void main(String[] args) {
        System.out.println(divisorSubstrings(240, 2));
        System.out.println(divisorSubstrings(430043, 2));
    }

    public static int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int len = str.length();
        int res = 0;

        StringBuilder sb = new StringBuilder(str.substring(0, k));
        int val = Integer.parseInt(sb.toString());
        if (val > 0 && num % val == 0) res++;

        for (int i = k; i < len; i++) {
            sb.deleteCharAt(0);
            sb.append(str.charAt(i));

            val = Integer.parseInt(sb.toString());
            if (val > 0 && num % val == 0) res++;
        }

        return res;
    }
}