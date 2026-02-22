import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople(new String[] {"Mary","John","Emma"}, new int[] {180,165,170})));
        System.out.println(Arrays.toString(sortPeople(new String[] {"Alice","Bob","Bob"}, new int[] {155,185,150})));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < names.length; i++)
            map.put(heights[i], names[i]);

        return map.values().toArray(new String[0]);
    }
}