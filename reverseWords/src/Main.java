public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("Mr Ding"));
    }

    public static String reverseWords(String s) {
        if (s.length() == 1) return s;

        String res = "";
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (res != "") res += " ";
            res += new StringBuilder(arr[i]).reverse().toString();
        }

        return res;
    }
}