import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] {1,2,2,1,1,3}));
        System.out.println(uniqueOccurrences(new int[] {1,2}));
        System.out.println(uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
        System.out.println(uniqueOccurrences(new int[] {-3}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int elm : arr )
            map.put(elm, map.getOrDefault(elm, 0) + 1);

        return map.values().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .count() == 0;
    }
}