public class Main {
    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbcccddddeeeeedcba"));
        System.out.println(maxPower("cc"));
    }

    public static int maxPower(String s) {
        char[] chars = s.toCharArray();
        int maxLen = 1;
        int curLen = 1;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1])
                curLen++;
            else {
                if (maxLen < curLen) maxLen = curLen;
                curLen = 1;
                if (i + maxLen > chars.length) break;
            }
        }

        return Math.max(maxLen, curLen);
    }
}