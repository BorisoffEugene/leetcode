public class Main {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("", "y"));
        System.out.println(findTheDifference("a", "aa"));
    }

    public static char findTheDifference(String s, String t) {
        char[] arr = s.toCharArray();
        for (char c : arr)
            t = t.replaceFirst(Character.toString(c), "");

        return t.charAt(0);
    }
}