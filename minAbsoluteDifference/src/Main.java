public class Main {
    public static void main(String[] args) {
        System.out.println(minAbsoluteDifference(new int[] {1,0,0,2,0,1}));
        System.out.println(minAbsoluteDifference(new int[] {1,0,1,0}));
    }

    public static int minAbsoluteDifference(int[] nums) {
        int res = 100;
        int tmp;

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == 1) {
                for (int j = i + 1; j < nums.length; j++)
                    if (nums[j] == 2) {
                        tmp = Math.abs(i - j);
                        if (tmp < res) res = tmp;
                        break;
                    }
            } else if (nums[i] == 2) {
                for (int j = i + 1; j < nums.length; j++)
                    if (nums[j] == 1) {
                        tmp = Math.abs(i - j);
                        if (tmp < res) res = tmp;
                        break;
                    }
            }

        return res == 100 ? -1 : res;
    }
}