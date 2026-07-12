public class Main {
    public static void main(String[] args) {

    }

    public static int[] distinctDifferenceArray(int[] nums) {
        int[] freq = new int[51];

        for (int num : nums)
            freq[num]++;

        int cnt = 0;
        for (int f : freq)
            if (f == 1) cnt++;

        for (int i = 0; i < nums.length; i++)
            if (freq[nums[i]] == 1) {
                nums[i] 
            }

    }
}