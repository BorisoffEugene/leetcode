public class Main {
    public static void main(String[] args) {
        System.out.println(maxFrequencyElements(new int[]{1,2,2,3,1,4}));
        System.out.println(maxFrequencyElements(new int[]{1,2,3,4,5}));
    }

    public static int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        int max = 0;
        int res = 0;

        for (int num : nums)
            max = Math.max(max, ++arr[num]);

        for (int i = 1; i < 101; i++)
            if (arr[i] == max) res += max;

        return res;
    }
}