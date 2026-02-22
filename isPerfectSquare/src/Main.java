public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));
        System.out.println(isPerfectSquare(1));
    }

    public static boolean isPerfectSquare(int num) {
        double sq = Math.pow(num, 0.5);
        return (sq - Math.floor(sq)) <= 0.0000001;
    }
}