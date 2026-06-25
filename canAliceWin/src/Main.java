public class Main {
    public static void main(String[] args) {
        System.out.println(canAliceWin(12));
        System.out.println(canAliceWin(1));
    }

    public static boolean canAliceWin(int n) {
        int cnt = 10;
        boolean res = false;

        while (n >= cnt && n > 0 && cnt > 0) {
            res = !res;
            n -= cnt;
            cnt--;
        }

        return res;
    }
}