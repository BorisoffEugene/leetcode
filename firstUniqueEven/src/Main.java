public class Main {
    public static void main(String[] args) {
        System.out.println(firstUniqueEven(new int[] {3,4,2,5,4,6}));
        System.out.println(firstUniqueEven(new int[] {4,4}));
        System.out.println(firstUniqueEven(new int[] {3,4,6,5,4,2}));
    }

    public static int firstUniqueEven(int[] nums) {
        int[] freq = new int[101];

        for (int num : nums)
            freq[num]++;

        for (int num : nums)
            if (freq[num] == 1 && num % 2 == 0) return num;

        return -1;
    }
}