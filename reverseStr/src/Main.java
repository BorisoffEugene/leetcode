public class Main {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
        System.out.println(reverseStr("abcdefg", 3));
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int k2 = 2 * k;
        int k_2 = k / 2;
        int ost = len % k2;
        int end = len - ost;
        char tmp;

        for (int i = 0; i < end; i += k2)
            for (int j = 0; j < k_2; j++) {
                tmp = chars[i + j];
                chars[i + j] = chars[i + k - j - 1];
                chars[i + k - j - 1] = tmp;
            }

        if (ost == 0) return new String(chars);

        int start = end;
        if (ost < k) {
            end = ost/2;
            for (int j = 0; j < end; j++) {
                tmp = chars[start + j];
                chars[start + j] = chars[len - j - 1];
                chars[len - j - 1] = tmp;
            }
        } else
            for (int j = 0; j < k_2; j++) {
                tmp = chars[start + j];
                chars[start + j] = chars[start + k - j - 1];
                chars[start + k - j - 1] = tmp;
            }

        return new String(chars);
    }
}