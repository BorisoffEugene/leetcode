public class Main {
    public static void main(String[] args) {
        System.out.println('d' - 'a');
        System.out.println(largestInteger(new int[] {3,9,2,1,7}, 3));
        System.out.println(largestInteger(new int[] {3,9,7,2,1,7}, 4));
        System.out.println(largestInteger(new int[] {0,0}, 1));
    }

    public static int largestInteger(int[] nums, int k) {
        int[] arr = new int[51];
        for (int num : nums) arr[num]++;

        if (k == 1) {
            for (int i = arr.length - 1; i >= 0; i--)
                   if (arr[i] == 1) return i;

            return -1;
        }

        if (k == nums.length)
            for (int i = arr.length - 1; i >= 0; i--)
                if (arr[i] > 0) return i;

        if (arr[nums[0]] > 1) nums[0] = -1;
        if (arr[nums[nums.length - 1]] > 1) nums[nums.length - 1] = -1;

        return Math.max(nums[0], nums[nums.length - 1]);
    }
}