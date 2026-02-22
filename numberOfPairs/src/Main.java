import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfPairs(new int[] {1,3,2,1,3,2,2})));
        System.out.println(Arrays.toString(numberOfPairs(new int[] {1,1})));
        System.out.println(Arrays.toString(numberOfPairs(new int[] {0})));
    }

    public static int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];

        for (int num : nums)
            freq[num]++;

        int[] res = new int[2];
        for (int f : freq)
            if (f > 0) {
                res[0] += f / 2;
                res[1] += f % 2;
            }

        return res;
    }
}