public class Main {
    public static void main(String[] args) {
        System.out.println(findTheLongestBalancedSubstring("01000111"));
        System.out.println(findTheLongestBalancedSubstring("00111"));
        System.out.println(findTheLongestBalancedSubstring("111"));
        System.out.println(findTheLongestBalancedSubstring("001"));
    }

    public static int findTheLongestBalancedSubstring(String s) {
        char[] chars = s.toCharArray();

        int i = 0;
        int lenZero;
        int lenOne;
        int max = 0;

        // идем до первого 0
        while (i < chars.length && chars[i] == '1') i++;

        while (i < chars.length) {
            // считаем 0
            lenZero = 0;
            while (i < chars.length && chars[i] == '0') {
                lenZero++;
                i++;
            }
            // считаем 1
            lenOne = 0;
            while (i < chars.length && chars[i] == '1') {
                lenOne++;
                i++;
            }
            // считаем макс
            max = Math.max(max, 2 * Math.min(lenZero, lenOne));
        }

        return max;
    }
}