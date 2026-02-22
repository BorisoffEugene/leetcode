import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(findLucky(new int[] {2,2,3,4}));
        System.out.println(findLucky(new int[] {1,2,2,3,3,3}));
        System.out.println(findLucky(new int[] {2,2,2,3,3}));
    }

    public static int findLucky(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int elm : arr)
            map.put(elm, map.getOrDefault(elm, 0) + 1);

        return map.entrySet().stream()
                .filter(entry -> entry.getKey().equals(entry.getValue()))
                .max(Comparator.comparing(Map.Entry::getKey))
                .orElse(new AbstractMap.SimpleEntry<>(-1, -1))
                .getKey();
    }
}