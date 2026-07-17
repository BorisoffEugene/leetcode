import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minBitwiseArray(List.of(2, 3, 5, 7))));
        System.out.println(Arrays.toString(minBitwiseArray(List.of(11,13,31))));
    }

    public static int[] minBitwiseArray(List<Integer> nums) {
        int[] res = new int[nums.size()];

        int i = 0;
        for (int num : nums)
            res[i++] = findRes(num);

        return res;
    }

    public static int findRes(int num) {
        if (num == 2) return -1;

        int trailingOnes = (num ^ (num + 1)) >> 1;
        int highestBitOfTrailingOnes = Integer.highestOneBit(trailingOnes);

        return num ^ highestBitOfTrailingOnes;
    }
}