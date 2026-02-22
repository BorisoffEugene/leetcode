import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSneakyNumbers(new int[] {0,1,1,0})));
        System.out.println(Arrays.toString(getSneakyNumbers(new int[] {0,3,2,1,3,2})));
        System.out.println(Arrays.toString(getSneakyNumbers(new int[] {7,1,5,4,3,4,6,0,9,5,8,2})));
    }

    public static int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[100];
        int[] res = new int[2];
        int cnt = -1;

        for (int num : nums) {
            if (++arr[num] == 2) res[++cnt] = num;
            if (cnt == 1) return res;
        }

        return res;
    }
}