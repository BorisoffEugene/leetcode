public class Main {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
        System.out.println(findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int tmp = 0;
        int max = 0;

        for (int elm : nums) {
            if (elm == 0) {
                if (max < tmp) max = tmp;
                tmp = 0;
            } else
                tmp++;
        }

        if (max < tmp) max = tmp;

        return max;
    }
}