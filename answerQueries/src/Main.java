import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21})));
        System.out.println(Arrays.toString(answerQueries(new int[]{2,3,4,5}, new int[]{1})));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];

        boolean isFind;
        for (int j = 0; j < queries.length; j++) {
            isFind = false;

            for (int i = 0; i < nums.length; i++)
                if (queries[j] < nums[i]) {
                    queries[j] = i;
                    isFind = true;
                    break;
                }

            if (!isFind) queries[j] = nums.length;
        }

        return queries;
    }
}