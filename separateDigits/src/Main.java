import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(separateDigits(new int[] {13,25,83,77})));
        System.out.println(Arrays.toString(separateDigits(new int[] {7,1,3,9})));
    }

    public static int[] separateDigits(int[] nums) {
        int cur;
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            cur = nums[i];

            while (cur > 0) {
                list.addFirst(cur % 10);
                cur /= 10;
            }
        }

        int[] res = new int[list.size()];
        int idx = 0;
        for (int elm : list)
            res[idx++] = elm;

        return res;
    }
}