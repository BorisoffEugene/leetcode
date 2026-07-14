import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByReflection(new int[] {3,6,5,8})));
    }

    public static int[] sortByReflection(int[] nums) {
        int[][] arr = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = Integer.reverse(nums[i]) >>> Integer.numberOfLeadingZeros(nums[i]);
            arr[i][1] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            res[i] = arr[i][1];

        return res;
    }


}