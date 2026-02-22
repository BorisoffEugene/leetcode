import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIndices(new int[] {5,1,4,1}, 2, 4)));
        System.out.println(Arrays.toString(findIndices(new int[] {2,1}, 0, 0)));
        System.out.println(Arrays.toString(findIndices(new int[] {1,2,3}, 2, 4)));
    }

    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        if (indexDifference == 0 && valueDifference == 0) return new int[] {0, 0};

        for (int i = 0; i < nums.length - indexDifference; i++)
            for (int j = i + indexDifference; j < nums.length; j++)
                if (Math.abs(nums[i] - nums[j]) >= valueDifference)
                    return new int[] {i, j};

        return new int[] {-1, -1};
    }
}