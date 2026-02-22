public class Main {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
        System.out.println(smallestEvenMultiple(6));
        System.out.println(smallestEvenMultiple(1));
        System.out.println(smallestEvenMultiple(2));
        System.out.println(smallestEvenMultiple(3));
    }

    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;
        return n * 2;
    }
}