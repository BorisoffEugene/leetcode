public class Main {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
        System.out.println(truncateSentence("What is the solution to this problem", 4));
        System.out.println(truncateSentence("chopper is not a tanuki", 5));
    }

    public static String truncateSentence(String s, int k) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (c == ' ') if ((k--) == 1) break;
            sb.append(c);
        }

        return sb.toString();
    }
}