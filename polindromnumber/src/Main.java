public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;

        String input = ""+x;
        String reverse = new StringBuilder(input).reverse().toString();

        return input.equals(reverse);
    }
}