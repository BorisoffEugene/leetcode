import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(duplicateNumbersXOR(new int[] {1,2,1,3}));
        System.out.println(duplicateNumbersXOR(new int[] {1,2,3}));
        System.out.println(duplicateNumbersXOR(new int[] {1,2,2,1}));
    }

    public static int duplicateNumbersXOR(int[] nums) {
        int res = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)
            if (!set.add(num))
                res ^= num;

        return res;
    }
}