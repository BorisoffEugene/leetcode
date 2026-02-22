import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(countGoodRectangles(new int[][] {{5,8},{3,9},{5,12},{16,5}}));
        System.out.println(countGoodRectangles(new int[][] {{2,3},{3,7},{4,3},{3,7}}));
        System.out.println(countGoodRectangles(new int[][] {{5,8},{3,9},{3,12}}));
    }

    public static int countGoodRectangles(int[][] rectangles) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int key;
        int val;
        int max = 0;

        for (int[] rec : rectangles) {
            key = Math.min(rec[0], rec[1]);
            val = map.getOrDefault(key, 0) + 1;
            map.put(key, val);
            if (key > max) max = key;
        }

        return map.get(max);
    }
}