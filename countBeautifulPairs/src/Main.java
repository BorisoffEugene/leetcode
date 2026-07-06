public class Main {
    public static void main(String[] args) {
        System.out.println(countBeautifulPairs(new int[] {2,5,1,4}));
        System.out.println(countBeautifulPairs(new int[] {11,21,12}));
    }

    public static int countBeautifulPairs(int[] nums) {
        boolean[][] isBeautiful = {
                {false, false, false, false, false, false, false, false, false, false},
                {false, true, true, true, true, true, true, true, true, true},
                {false, true, false, true, false, true, false, true, false, true},
                {false, true, true, false, true, true, false, true, true, false},
                {false, true, false, true, false, true, false, true, false, true},
                {false, true, true, true, true, false, true, true, true, true},
                {false, true, false, false, false, true, false, true, false, false},
                {false, true, true, true, true, true, true, false, true, true},
                {false, true, false, true, false, true, false, true, false, true},
                {false, true, true, false, true, true, false, true, true, false}
        };

        int res = 0;
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (isBeautiful[first(nums[i])][last(nums[j])]) res++;

        return res;
    }

    public static int first(int num) {
        if (num < 10) return num;
        if (num < 100) return num / 10;
        if (num < 1000) return num / 100;
        return num / 1_000;
    }

    public static int last(int num) {
        return num % 10;
    }
}