import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("({[]})"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char c2 = s.charAt(i);

            if (stack.empty()) {
                stack.push(c2);
                continue;
            }

            char c1 = stack.peek();
            if (check(c1, c2)) stack.pop(); else stack.push(c2);
        }

        return stack.empty();
    }

    public static boolean check(char c1, char c2) {
        if (c1 == '(' && c2 == ')') return true;
        if (c1 == '{' && c2 == '}') return true;
        if (c1 == '[' && c2 == ']') return true;

        return false;
    }
}