import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));
        System.out.println(repeatedCharacter("abcdd"));
    }

    public static char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        int len = s.length();
        char c;

        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            if (!set.add(c)) return c;
        }

        return ' ';
    }
}