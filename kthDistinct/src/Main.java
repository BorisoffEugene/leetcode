import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[] {"d","b","c","b","c","a"}, 2));
        System.out.println(kthDistinct(new String[] {"aaa","aa","a"}, 1));
        System.out.println(kthDistinct(new String[] {"a","b","a"}, 3));
    }

    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : arr)
            map.put(str, map.getOrDefault(str, 0) + 1);

        for (String str : arr)
            if (map.get(str) == 1) {
                k--;
                if (k == 0) return str;
            }

        return "";
    }
}