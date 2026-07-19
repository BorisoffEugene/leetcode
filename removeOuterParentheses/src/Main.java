public class Main {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(removeOuterParentheses("()()"));
    }

    public static String removeOuterParentheses(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int opened = 0;

        for (char c : chars)
            if (c == '(') {
                if (opened > 0) sb.append(c);
                opened++;
            } else {
                opened--;
                if (opened > 0) sb.append(c);
            }

        return sb.toString();
    }
}