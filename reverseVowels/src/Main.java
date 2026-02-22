import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        if (s.length() == 1) return s;

        String vowels = "aeiou";
        char[] arr = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char elm : arr)
            if (vowels.indexOf(Character.toLowerCase(elm)) != -1)
                stack.push(elm);

        String res = "";
        for (char elm : arr)
            if (vowels.indexOf(Character.toLowerCase(elm)) != -1)
                res += stack.pop();
            else
                res += elm;

        return res;
    }
}