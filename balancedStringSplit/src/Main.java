public class Main {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }

    public static int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        int cnt = 0;

        for (char c : chars) {
            sum += c == 'R' ? -1 : 1;
            if (sum == 0) cnt++;
        }

        return cnt;
    }
}