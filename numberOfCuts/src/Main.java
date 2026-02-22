public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfCuts(4));
        System.out.println(numberOfCuts(3));
        System.out.println(numberOfCuts(5));
        System.out.println(numberOfCuts(6));
        System.out.println(numberOfCuts(7));
    }

    public static int numberOfCuts(int n) {
        if (n == 1) return 0;
        if ((n & 1) == 0) return n / 2;
        return n;
    }
}