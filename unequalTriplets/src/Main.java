public class Main {
    public static void main(String[] args) {
        System.out.println(unequalTriplets(new int[] {4,4,2,4,3}));
        System.out.println(unequalTriplets(new int[] {1,1,1,1,1}));
    }

    public static int unequalTriplets(int[] nums) {
        int lenI = nums.length - 2;
        int lenJ = nums.length - 1;
        int lenK = nums.length;
        int res = 0;

        for (int i = 0; i < lenI; i++)
            for (int j = i + 1; j < lenJ; j++)
                for (int k = j + 1; k < lenK; k++)
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) res++;

        return res;
    }
}