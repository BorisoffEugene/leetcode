public class Main {
    public static void main(String[] args) {
        System.out.println(differenceOfSums(10, 3));
        System.out.println(differenceOfSums(5, 6));
        System.out.println(differenceOfSums(5, 1));
    }

    public static int differenceOfSums(int n, int m) {
        int mCnt = n / m;
        return (n * (n + 1)) / 2 - m * mCnt * (1 + mCnt);
    }
}