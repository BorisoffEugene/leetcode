public class Main {
    public static void main(String[] args) {
        System.out.println(closestTarget(new String[]{"hello","i","am","leetcode","hello"}, "hello", 1));
        System.out.println(closestTarget(new String[]{"a","b","leetcode"}, "leetcode", 0));
        System.out.println(closestTarget(new String[]{"i","eat","leetcode"}, "ate", 0));
    }

    public static int closestTarget(String[] words, String target, int startIndex) {
        if (words[startIndex].equals(target)) return 0;

        int len = words.length / 2;
        for (int i = 1; i <= len; i++) {
            if (words[(startIndex + i) % words.length].equals(target)) return i;
            if (words[(startIndex - i + words.length) % words.length].equals(target)) return i;
        }

        return -1;
    }
}