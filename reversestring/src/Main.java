public class Main {
    public static void main(String[] args) {
        char[] arr = new char[] {'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(arr);
    }

    public static void reverseString(char[] s) {
        String str = new String(s);
        String revStr = new StringBuilder(str).reverse().toString();
        char[] res = revStr.toCharArray();
        System.arraycopy(res, 0, s, 0, res.length);
    }
}