public class Main {
    public static void main(String[] args) {
        System.out.println(arraySign(new int[] {-1,-2,-3,-4,3,2,1}));
        System.out.println(arraySign(new int[] {1,5,0,2,-3}));
        System.out.println(arraySign(new int[] {-1,1,-1,1,-1}));
    }

    public static int arraySign(int[] nums) {
        int cnt = 0;
        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) cnt++;
        }

        return cnt % 2 == 0 ? 1 : -1;

    }
}