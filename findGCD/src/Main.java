
public class Main {
    public static void main(String[] args) {
        System.out.println(findGCD(new int[] {2,5,6,9,10}));
        System.out.println(findGCD(new int[] {7,5,6,8,3}));
        System.out.println(findGCD(new int[] {3,3}));
    }

    public static int findGCD(int[] nums) {
        int min = 1001;
        int max = 0;
        int tmp;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (min == max) return min;

        while (min != 0) {
            tmp = min;
            min = max % min;
            max = tmp;
        }

        return max;
    }
}