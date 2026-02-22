public class Main {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
        System.out.println(arrangeCoins(2));
        System.out.println(arrangeCoins(3));
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(2147483647));
        System.out.println(arrangeCoins(1804289383));
    }

    public static int arrangeCoins(int n) {
        int cnt = n;
        int i = 1;

        while (i <= cnt) {
            cnt -= i;
            i++;
        }

        return i - 1;
    }
}