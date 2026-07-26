public class Main {
    public static void main(String[] args) {
        System.out.println(countValidSelections(new int[] {1,0,2,0,3}));
        System.out.println(countValidSelections(new int[] {2,3,4,0,4,1,0}));
    }

    public static int countValidSelections(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        int res = 0;

        for (int num : nums)
            totalSum += num;

        for (int num : nums)
            if (num == 0)
                switch (Math.abs((leftSum << 1) - totalSum)) {
                    case 0 -> res += 2;
                    case 1 -> res += 1;
                }
            else
                leftSum += num;

        return res;
    }
}