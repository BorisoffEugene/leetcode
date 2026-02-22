public class Main {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {
        int len = command.length() - 1;
        StringBuilder sb = new StringBuilder();
        char c;

        for (int i = 1; i <= len; i++) {
            c = command.charAt(i);
            if (c == ')') {
                sb.append('o');
                i++;
            }
            else if (c == 'a') {
                sb.append("al");
                i += 3;
            }
            else
                sb.append('G');
        }

        if (command.charAt(len) == 'G') sb.append('G');

        return sb.toString();
    }
}