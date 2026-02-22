public class Main {
    public static void main(String[] args) {
        System.out.println(generateTheString(4));
        System.out.println(generateTheString(7));
    }

    public static String generateTheString(int n) {
        if (n % 2 != 0) return "a".repeat(n);

        return "a".repeat(n - 1) + "z";
    }
}