import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
        System.out.println(minLength("ACBBD"));
    }

    public static int minLength(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (stack.isEmpty())
                stack.push(c);
            else if (c == 'B' && stack.peek() == 'A')
                stack.pop();
            else if (c == 'D' && stack.peek() == 'C')
                stack.pop();
            else
                stack.push(c);
        }

        return stack.size();
    }
}