import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        List<Character> charsM = magazine.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        char[] arrN = ransomNote.toCharArray();

        for (char elm : arrN) {
            int idx = charsM.indexOf(elm);
            if (idx == -1) return false;

            charsM.remove(idx);
        }

        return true;
    }
}