import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(twoOutOfThree(new int[]{1,1,3,2}, new int[]{2,3}, new int[]{3}));
        System.out.println(twoOutOfThree(new int[]{3,1}, new int[]{2,3}, new int[]{1,2}));
        System.out.println(twoOutOfThree(new int[]{1,2,2}, new int[]{4,3,3}, new int[]{5}));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1;
        HashSet<Integer> set2;
        HashSet<Integer> set3;

        int minLen = Math.min(nums1.length, Math.min(nums2.length, nums3.length));
        int maxLen = Math.max(nums1.length, Math.max(nums2.length, nums3.length));

        if (nums1.length == minLen) {
            set1 = fillSet(nums1);
            if (nums3.length == maxLen) {
                set2 = fillSet(nums2);
                set3 = fillSet(nums3);
            }
            else {
                set2 = fillSet(nums3);
                set3 = fillSet(nums2);
            }
        } else if (nums2.length == minLen) {
            set1 = fillSet(nums2);
            if (nums3.length == maxLen) {
                set2 = fillSet(nums1);
                set3 = fillSet(nums3);
            }
            else {
                set2 = fillSet(nums3);
                set3 = fillSet(nums1);
            }
        } else {
            set1 = fillSet(nums3);
            if (nums1.length == maxLen) {
                set2 = fillSet(nums2);
                set3 = fillSet(nums1);
            }
            else {
                set2 = fillSet(nums1);
                set3 = fillSet(nums2);
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int elm : set1)
            if (set2.contains(elm)) res.add(elm);
            else if (set3.contains(elm)) res.add(elm);

        for (int elm : set2)
            if (!set1.contains(elm) && set3.contains(elm)) res.add(elm);

        return res;
    }

    public static HashSet<Integer> fillSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        return set;
    }
}