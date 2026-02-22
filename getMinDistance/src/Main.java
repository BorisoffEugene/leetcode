public class Main {
    public static void main(String[] args) {
        System.out.println(getMinDistance(new int[] {5,3,6}, 5, 2));
    }

    public static int getMinDistance(int[] nums, int target, int start) {
        int res = 0;

        while (true) {
            if (start + res < nums.length && nums[start + res] == target) return res;
            if (start - res >= 0 && nums[start - res] == target) return res;
            res++;
        }
    }
}