import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1,2,3,3}));
        System.out.println(repeatedNTimes(new int[]{2,1,2,5,3,2}));
        System.out.println(repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }

    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;
        int cnt;

        for (int num : nums) {
            cnt = map.getOrDefault(num, 0) + 1;
            if (cnt == n) return num;
            map.put(num, cnt);
        }

        return -1;
    }
}