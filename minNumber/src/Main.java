public class Main {
    public static void main(String[] args) {
        System.out.println(minNumber(new int[] {4,1,3}, new int[] {5,7}));
        System.out.println(minNumber(new int[] {3,5,2,6}, new int[] {3,1,7}));
    }

    public static int minNumber(int[] nums1, int[] nums2) {
        int[] arr = new int[10];
        int min = 10;
        int min1 = 10;
        int min2 = 10;

        for (int num : nums1) {
            arr[num] = 1;
            if (num < min1) min1 = num;
        }

        for (int num : nums2) {
            if (arr[num] == 1 && num < min) min = num;
            if (num < min2) min2 = num;
        }

        if (min < 10) return min;

        return Math.min(min1, min2) * 10 + Math.max(min1, min2);
    }
}