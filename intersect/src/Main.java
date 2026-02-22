import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.bitCount(3^1));
        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1}, new int[]{1,1})));
        //System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] smallArr;
        int[] bigArr;

        if (nums1.length < nums2.length) {
            smallArr = nums1;
            bigArr = nums2;
        } else {
            bigArr = nums1;
            smallArr = nums2;
        }

        Arrays.sort(bigArr);

        int idx;
        List<Integer> res = new ArrayList<>();

        for (int elm : smallArr) {
            idx = Arrays.binarySearch(bigArr, elm);
            System.out.println("elm: " + elm);
            System.out.println(Arrays.toString(bigArr));
            System.out.println("idx: " + idx);
            if (idx >= 0) {
                bigArr[idx] = -1;
                Arrays.sort(bigArr);
                res.add(elm);
                System.out.println("find elm: " + elm);
                System.out.println(Arrays.toString(bigArr));
                System.out.println("idx: " + idx);
            }
        }

        return res.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}