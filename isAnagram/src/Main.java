import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<String, Integer> mapS = new HashMap<>();
        HashMap<String, Integer> mapT = new HashMap<>();

        strToMap(s, mapS);
        strToMap(t, mapT);

        return mapS.equals(mapT);
    }

    public static void strToMap(String s, HashMap<String, Integer> map) {
        int len = s.length();
        for(int i = 0; i < len; i++)
            map.put(s.substring(i, i + 1), map.getOrDefault(s.substring(i, i + 1), 0) + 1);
    }
}