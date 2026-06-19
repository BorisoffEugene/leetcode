public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfPairs(new int[] {1,3,4}, new int[] {1,3,4}, 1));
    }

    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int div;
        int res = 0;

        for (int num2 : nums2) {
            div = num2 * k;
            for (int num1 : nums1)
                if (num1 % div == 0) res++;
        }

        return res;
    }
}