import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        System.out.println(decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }

    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int len = key.length();
        char alpha = 'a';
        for (int i = 0; i < len; i++) {
            char c = key.charAt(i);
            if (c == ' ') continue;
            if (map.containsKey(c)) continue;
            map.put(c, alpha++);
        }
        map.put(' ', ' ');

        StringBuilder res = new StringBuilder();
        len = message.length();
        for (int i = 0; i < len; i++)
            res.append(map.get(message.charAt(i)));

        return res.toString();
    }
}