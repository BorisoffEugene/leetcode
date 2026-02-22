public class Main {
    static final int[] ARR9 = {9, 99, 999};

    public static void main(String[] args) {
        System.out.println(differenceOfSum(new int[] {1,15,6,3}));
        System.out.println(differenceOfSum(new int[] {1,2,3,4}));
        System.out.println(differenceOfSum(new int[] {1,2,3,4, 2000}));
    }

    public static int differenceOfSum(int[] nums) {
        int res = 0;

        for (int num : nums)
            if (num > 9) res += numDiff(num);

        return res;
    }

    public static int numDiff(int num) {
        num /= 10;
        int res = 0;
        int k = 0;

        while (num > 0) {
            res = res + (num % 10) * ARR9[k];
            num /= 10;
            k++;
        }

        return res;
    }
}