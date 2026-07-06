public class Main {
    public static void main(String[] args) {
        System.out.println(minimumPushes("abcde"));
        System.out.println(minimumPushes("xycdefghij"));
    }

    public static int minimumPushes(String word) {
        int len = word.length();
        int main = len / 8;
        int ost = len % 8;

        if (main == 0) return ost;
        if (main == 1) return 8 + 2 * ost;
        if (main == 2) return 24 + 3 * ost;
        return 48 + 4 * ost;
    }
}