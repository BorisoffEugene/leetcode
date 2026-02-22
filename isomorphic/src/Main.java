import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<String, String> map = new HashMap<>();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            String oldVal = map.put(s.substring(i, i + 1), t.substring(i, i + 1));
            if (oldVal == null) continue;
            if (!oldVal.equals(t.substring(i, i + 1))) return false;
        }

        map.clear();

        for (int i = 0; i < len; i++) {
            String oldVal = map.put(t.substring(i, i + 1), s.substring(i, i + 1));
            if (oldVal == null) continue;
            if (!oldVal.equals(s.substring(i, i + 1))) return false;
        }

        return true;
    }
}