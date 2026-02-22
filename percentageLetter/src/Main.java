public class Main {
    public static void main(String[] args) {
        System.out.println(percentageLetter("foobar", 'o'));
        System.out.println(percentageLetter("jjjj", 'k'));
    }

    public static int percentageLetter(String s, char letter) {
        int len = s.length();
        int cnt = 0;
        char[] chars = s.toCharArray();

        for (char c : chars)
            if (c == letter) cnt++;

        return 100 * cnt / len;
    }
}