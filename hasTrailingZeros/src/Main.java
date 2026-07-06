public class Main {
    public static void main(String[] args) {
        System.out.println(hasTrailingZeros(new int[] {1,2,3,4,5}));
        System.out.println(hasTrailingZeros(new int[] {2,4,8,16}));
        System.out.println(hasTrailingZeros(new int[] {1,3,5,7,9}));
    }

    public static boolean hasTrailingZeros(int[] nums) {
        boolean isFind = false;

        for (int num : nums)
            if ((num & 1) == 0) {
                if (isFind) return true;
                isFind = true;
            }

        return false;
    }
}