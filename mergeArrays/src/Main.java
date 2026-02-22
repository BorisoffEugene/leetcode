import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(mergeArrays(
                new int[][] {{1,2},{2,3},{4,5}},
                new int[][] {{1,4},{3,2},{4,1}}
        )));
        System.out.println(Arrays.deepToString(mergeArrays(
                new int[][] {{2,4},{3,6},{5,5}},
                new int[][] {{1,3},{4,3}}
        )));
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[][] numsG;
        int[][] numsS;

        if (nums1.length > nums2.length) {
            numsG = nums1;
            numsS = nums2;
        } else {
            numsG = nums2;
            numsS = nums1;
        }

        for (int[] num : numsG)
            map.put(num[0], num[1]);

        for (int[] num : numsS)
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);

        int[][] res = new int[map.size()][2];
        int idx = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res[idx][0] = entry.getKey();
            res[idx][1] = entry.getValue();
            idx++;
        }

        return res;
    }
}