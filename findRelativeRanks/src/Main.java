import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[] {5,4,3,2,1})));
        System.out.println(Arrays.toString(findRelativeRanks(new int[] {10,3,8,9,4})));
        System.out.println(Arrays.toString(findRelativeRanks(new int[] {10})));
    }

    public static String[] findRelativeRanks(int[] score) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < score.length; i++)
            map.put(score[i], i);

        String[] res = new String[score.length];

        int i = 0;
        for (Map.Entry<Integer, Integer> elm : map.entrySet())
            switch (++i) {
                case 1 -> res[elm.getValue()] = "Gold Medal";
                case 2 -> res[elm.getValue()] = "Silver Medal";
                case 3 -> res[elm.getValue()] = "Bronze Medal";
                default -> res[elm.getValue()] =Integer.toString(i);
            }

        return res;
    }
}