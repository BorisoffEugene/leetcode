public class Main {
    public static void main(String[] args) {
        System.out.println(digitSum("11111222223", 3));
        System.out.println(digitSum("00000000", 3));
    }

    public static String digitSum(String s, int k) {
        int len = s.length();
        if (len <= k) return s;

        char[] chars = s.toCharArray();
        int sum = 0;
        int end;
        int end1;
        StringBuilder sb = new StringBuilder();

        while (len > k) {
            sb.setLength(0);
            end = k* (len / k);
            end1 = end + (len % k);
            for (int i = 1; i <= end; i++) {
                sum += chars[i - 1];
                if (i % k == 0) {
                    sb.append(sum - 48 * k);
                    sum = 0;
                }
            }

            if (end1 > end) {
                for (int i = end + 1; i <= end1; i++)
                    sum += chars[i - 1];

                sb.append(sum - 48 * (end1 - end));
                sum = 0;
            }

            chars = sb.toString().toCharArray();
            len = chars.length;
        }

        return sb.toString();
    }
}