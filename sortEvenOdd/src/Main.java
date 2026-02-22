import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortEvenOdd(new int[] {4,1,2,3})));
        System.out.println(Arrays.toString(sortEvenOdd(new int[] {2,1})));
    }

    public static int[] sortEvenOdd(int[] nums) {
        if (nums.length < 3) return nums;

        int[] even = new int[nums.length / 2 + (nums.length & 1)];
        int[] odd = new int[nums.length / 2];
        int idxEven = 0;
        int idxOdd = 0;

        for (int i = 0; i < nums.length; i++)
            if ((i & 1) == 0)
                even[idxEven++] = nums[i];
            else
                odd[idxOdd++] = nums[i];

        Arrays.sort(even);
        Arrays.sort(odd);

        idxEven = 0;
        idxOdd = odd.length - 1;

        for (int i = 0; i < nums.length; i++)
            if ((i & 1) == 0)
                nums[i] = even[idxEven++];
            else
                nums[i] = odd[idxOdd--];

        return nums;
    }
}