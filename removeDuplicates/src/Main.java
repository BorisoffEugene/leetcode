import java.util.Stack;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("azxxzy"));
        System.out.println(removeDuplicates("aaaa"));
    }

    public static String removeDuplicates(String s) {
        if (s.length() == 1) return s;

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char elm : chars) {
            if (stack.isEmpty()) stack.push(elm);
            else if (stack.peek() == elm) stack.pop();
            else stack.push(elm);
        }

        return stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }
}