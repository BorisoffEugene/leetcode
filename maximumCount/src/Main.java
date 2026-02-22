public class Main {
    public static void main(String[] args) {
        System.out.println(maximumCount(new int[] {-2,-1,-1,1,2,3}));
        System.out.println(maximumCount(new int[] {-3,-2,-1,0,0,1,2}));
        System.out.println(maximumCount(new int[] {5,20,66,1314}));
        System.out.println(maximumCount(new int[] {0,0}));
        System.out.println(maximumCount(new int[] {-2,-1,-1,0,0,0}));
    }

    public static int maximumCount(int[] nums) {
        int len = nums.length;

        if (nums[0] > 0 || nums[len - 1] < 0) return len;
        if (nums[0] == 0 && nums[len - 1] == 0) return 0;

        int idxPos = len;
        int start = 0;
        int end = len - 1;

        if (nums[len - 1] > 0)
            while (start <= end) {
                idxPos = start + (end - start) / 2;
                if (nums[idxPos] > 0 && nums[idxPos - 1] <= 0)
                    break;
                else if (nums[idxPos] > 0 && nums[idxPos - 1] > 0)
                    end = idxPos - 1;
                else
                    start = idxPos + 1;
            }

        int idxNeg = -1;

        if (nums[0] < 0) {
            start = 0;
            end = len - 1;
            while (start <= end) {
                idxNeg = start + (end - start) / 2;
                if (nums[idxNeg] < 0 && nums[idxNeg + 1] >= 0)
                    break;
                else if (nums[idxNeg] < 0 && nums[idxNeg + 1] < 0)
                    start = idxNeg + 1;
                else
                    end = idxNeg - 1;
            }
        }

        return Math.max(idxNeg + 1, len - idxPos);
    }
}