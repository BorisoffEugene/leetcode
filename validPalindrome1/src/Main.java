import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));
        System.out.println(validPalindrome("abc"));
    }

    public static boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int mid = chars.length / 2;
        int len = chars.length - 1;

        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < mid; i++) {
            queue.add(chars[i]);
            if (queue.peek().equals(chars[len - i]))
                queue.poll();
            else
                queue.add(chars[len - i]);
            System.out.println(queue);
        }

        return queue.size() < 2;
    }
}