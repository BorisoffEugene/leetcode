public class Main {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[] {1,2,3,1,1,3}));
        System.out.println(numIdenticalPairs(new int[] {1,1,1,1}));
        System.out.println(numIdenticalPairs(new int[] {1,2,3}));
    }

    public static int numIdenticalPairs(int[] nums) {
        int[] cnts = new int[101];

        for (int num : nums)
            cnts[num]++;

        int res = 0;
        for (int cnt : cnts)
            if (cnt > 1) res = res + cnt * (cnt - 1) / 2;

        return res;
    }
}