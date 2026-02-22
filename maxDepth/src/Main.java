import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
        System.out.println(maxDepth("()(())(())"));
    }

    public static int maxDepth(String s) {
        char[] chars = s.replaceAll("[^()]", "").toCharArray();
        Stack<Character> stack = new Stack<>();
        int max = 0;

        for (char ch : chars)
            if (ch == ')')
                stack.pop();
            else {
                stack.push(ch);
                int len = stack.size();
                if (max < len) max = len;
            }

        return max;
    }
}