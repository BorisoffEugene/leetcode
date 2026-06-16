public class Main {
    public static void main(String[] args) {
        System.out.println(passThePillow(4, 5));
        System.out.println(passThePillow(3, 2));
    }

    public static int passThePillow(int n, int time) {
        int round = time / (n - 1);
        int step = time % (n - 1);

        if (round % 2 == 1) return n - step;
        return 1 + step;
    }
}