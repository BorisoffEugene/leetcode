import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
        System.out.println(makeGood("abBAcC"));
        System.out.println(makeGood("s"));
    }

    public static String makeGood(String s) {
        int len = s.length() - 1;
        char c1;
        char c2;
        Stack<Character> stack = new Stack<>();

        for (int i = len; i >= 0; i--) {
            c1 = s.charAt(i);
            if (stack.isEmpty())
                stack.push(c1);
            else {
                c2 = stack.peek();
                if (Math.abs(c1 - c2) == 32) stack.pop(); else stack.push(c1);
            }
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            c2 = stack.pop();
            res.append(c2);
        }

        return res.toString();
    }
}