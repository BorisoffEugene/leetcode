import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) return false;

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String oldVal = map.put(pattern.substring(i, i + 1), arr[i]);
            if (oldVal == null) continue;
            if (!oldVal.equals(arr[i])) return false;
        }

        map.clear();

        for (int i = 0; i < arr.length; i++) {
            String oldVal = map.put(arr[i], pattern.substring(i, i + 1));
            if (oldVal == null) continue;
            if (!oldVal.equals(pattern.substring(i, i + 1))) return false;
        }

        return true;
    }
}