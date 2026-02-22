public class Main {
    public static void main(String[] args) {
        System.out.println(divideArray(new int[] {3,2,3,2,2,2}));
        System.out.println(divideArray(new int[] {1,2,3,4}));
    }

    public static boolean divideArray(int[] nums) {
        int[] cnt = new int[501];
        for(int num : nums)
            cnt[num]++;

        for (int elm : cnt)
            if (elm > 0 && elm % 2 == 1) return false;

        return true;
    }
}