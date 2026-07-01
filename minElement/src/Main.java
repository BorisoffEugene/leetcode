public class Main {
    public static void main(String[] args) {
        System.out.println(minElement(new int[] {10,12,13,14}));
        System.out.println(minElement(new int[] {1,2,3,4}));
        System.out.println(minElement(new int[] {999,19,199}));
    }

    public static int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int tmp;

        for (int num : nums) {
            tmp = sum(num);
            if (tmp == 1) return 1;
            if (tmp < min) min = tmp;
        }

        return min;
    }

    public static int sum(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }

        return res;
    }
}