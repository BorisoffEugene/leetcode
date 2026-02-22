public class Main {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
        System.out.println(firstUniqChar("d"));
    }

    public static int firstUniqChar(String s) {
        int len = s.length();

        for (int i = 0; i < len; i++) {
            String subs = s.substring(0, i) + s.substring(i + 1);
            if (subs.indexOf(s.charAt(i)) == -1)
                return i;
        }

        return -1;
    }
}