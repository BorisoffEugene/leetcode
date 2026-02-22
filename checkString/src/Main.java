public class Main {
    public static void main(String[] args) {
        System.out.println(checkString("aaabbb"));
        System.out.println(checkString("abab"));
        System.out.println(checkString("bbb"));
    }

    public static boolean checkString(String s) {
        return s.indexOf("ba") == -1;
    }
}