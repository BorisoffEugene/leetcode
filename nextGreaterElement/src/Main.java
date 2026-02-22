import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4})));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                map.put(nums2[stack.pop()], nums2[i]);
            }
            stack.push(i);
        }

        for (int i = 0; i < nums1.length; i++)
            if (map.containsKey(nums1[i]))
                res[i] = map.get(nums1[i]);
            else
                res[i] = -1;

        return res;
    }
}