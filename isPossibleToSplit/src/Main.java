import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPossibleToSplit(new int[] {1,1,2,2,3,4}));
        System.out.println(isPossibleToSplit(new int[] {1,1,1,1}));
        System.out.println(isPossibleToSplit(new int[] {1,2}));
    }

    public static boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int val;

        for(int num : nums) {
            val = map.getOrDefault(num, 0) + 1;
            if (val == 3) return false;
            map.put(num, val);
        }

        return true;
    }
}