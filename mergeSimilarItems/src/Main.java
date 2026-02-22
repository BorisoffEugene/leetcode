import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(mergeSimilarItems(
                new int[][]{{1,1},{4,5},{3,8}},
                new int[][]{{3,1},{1,5}}
        ));
        System.out.println(mergeSimilarItems(
                new int[][]{{1,1},{3,2},{2,3}},
                new int[][]{{2,1},{3,2},{1,3}}
        ));
        System.out.println(mergeSimilarItems(
                new int[][]{{1,3},{2,2}},
                new int[][]{{7,1},{2,2},{1,4}}
        ));
    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        if (items1.length >= items2.length) {
            for (int[] item : items1)
                map.put(item[0], item[1]);
            for (int[] item : items2)
                map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        } else {
            for (int[] item : items2)
                map.put(item[0], item[1]);
            for (int[] item : items1)
                map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            res.add(List.of(entry.getKey(), entry.getValue()));

        return res;
    }
}