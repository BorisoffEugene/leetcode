import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByBits(new int[] {0,1,2,3,4,5,6,7,8})));
        System.out.println(Arrays.toString(sortByBits(new int[] {1024,512,256,128,64,32,16,8,4,2,1})));
    }

    public static int[] sortByBits(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int elm : arr)
            map.put(elm, Integer.bitCount(elm));

        LinkedHashMap<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        return sortedMap.keySet().stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}