public class Main {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[] {12,345,2,6,7896}));
        System.out.println(findNumbers(new int[] {555,901,482,1771}));
    }

    public static int findNumbers(int[] nums) {
        int res = 0;

        for (int elm : nums)
            if (Integer.toString(elm).length() % 2 == 0) res++;

        return res;
    }
}