import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static int minimumDistance(int[] nums) {
        int[] i = new int[101];
        Arrays.fill(i, -1);
        int[] j = new int[101];
        Arrays.fill(j, -1);
        int[] k = new int[101];
        Arrays.fill(k, -1);

        for (int idx = 0; idx < nums.length; idx++)
            if (i[nums[idx]] == -1)
                i[nums[idx]] = idx;
            else if (j[nums[idx]] == -1)
                j[nums[idx]] = idx;
            else {
                
            }
    }
}