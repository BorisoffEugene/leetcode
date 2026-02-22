public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        String res = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if (res == "") return true;
        return (res.equals((new StringBuilder(res)).reverse().toString()));
    }
}