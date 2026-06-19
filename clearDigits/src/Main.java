import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println(clearDigits("abc"));
        System.out.println(clearDigits("cb34"));
    }

    public static String clearDigits(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();

        for (char c : chars)
            if (c >= 'a')
                stack.push(c);
            else
                stack.pop();

        StringBuilder sb = new StringBuilder();
        for (char c : stack)
            sb.append(c);

        return sb.reverse().toString();
    }
}