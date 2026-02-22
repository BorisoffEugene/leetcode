import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        sortColors(new int[] {2,0,2,1,1,0});
        sortColors(new int[] {2,0,1});
    }

    public static void sortColors(int[] nums) {
        int[] cnt = new int[3];
        for(int num : nums)
            cnt[num]++;

        int idx = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 1; j <= cnt[i]; j++)
                nums[idx++] = i;

        System.out.println(Arrays.toString(nums));
    }
}