import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIntersectionValues(new int[] {4,3,2,3,1}, new int[] {2,2,5,2,3,6})));
        System.out.println(Arrays.toString(findIntersectionValues(new int[] {3,4,2,3}, new int[] {1,5})));
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] res = new int[2];
        boolean[] ex = new boolean[101];

        for (int num1 : nums1)
            if (ex[num1])
                res[0]++;
            else
                for (int num2 : nums2)
                    if (num1 == num2) {
                        res[1]++;
                        if (!ex[num1]) {
                            res[0]++;
                            ex[num1] = true;
                        }
                    }

        return res;
    }
}