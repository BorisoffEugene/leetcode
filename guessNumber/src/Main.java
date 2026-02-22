public class Main {
    public static void main(String[] args) {
        System.out.println(guessNumber(2126753390));

    }

    public static int guess(int num) {
        int pick = 1702766719;

        if (num > pick) return -1;
        if (num == pick) return 0;

        return 1;
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        int res = start + (end - start) / 2;
        int g = guess(res);

        while (g != 0) {
            if (g == 1) start = res; else end = res;

            res = start + (end - start) / 2;
            g = guess(res);

            if ((g == 1) && (start == end - 1)) {
                res = end;
                break;
            }

        }

        return res;
    }
}