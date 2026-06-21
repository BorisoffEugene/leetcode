public class Main {
    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[] {0,1,0,3,12}));
        System.out.println(minimumSwaps(new int[] {0,1,0,2}));
        System.out.println(minimumSwaps(new int[] {1,2,0}));
        System.out.println(minimumSwaps(new int[] {0,0,0}));
        System.out.println(minimumSwaps(new int[] {1,1,1}));
    }

    public static int minimumSwaps(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int res = 0;

        while (start < end) {
            if (nums[start] == 0) {
                while (nums[end] == 0) {
                    end--;
                    if (end == start) return res;
                }
                res++;
                end--;
            }

            start++;
        }

        return res;
    }
}