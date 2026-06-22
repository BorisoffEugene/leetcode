public class Main {
    public static void main(String[] args) {
        System.out.println(sumDivisibleByK(new int[] {1,2,2,3,3,3,3,4}, 2));
        System.out.println(sumDivisibleByK(new int[] {1,2,3,4,5}, 2));
        System.out.println(sumDivisibleByK(new int[] {4,4,4,1,2,3}, 3));
    }

    public static int sumDivisibleByK(int[] nums, int k) {
        int[] freq = new int[101];
        int sum = 0;

        for (int num : nums) freq[num]++;

        for (int i = 1; i < 101; i++)
            if (freq[i] > 0 && freq[i] % k == 0) sum += i * freq[i];

        return sum;
    }
}