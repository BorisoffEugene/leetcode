import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumIndicesWithKSetBits(List.of(5,10,1,5,2), 1));
        System.out.println(sumIndicesWithKSetBits(List.of(4,3,2,1), 2));
    }

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int len = nums.size();
        int res = 0;

        for (int i = 0; i < len; i++)
            if (Integer.bitCount(i) == k)
                res += nums.get(i);

        return res;
    }
}