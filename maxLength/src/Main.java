public class Main {
    public static void main(String[] args) {
        System.out.println(maxLength(new int[] {1,2,1,2,1,1,1}));
        System.out.println(maxLength(new int[] {2,3,4,5,6}));
        System.out.println(maxLength(new int[] {1,2,3,1,4,5,1}));
    }

    public static int maxLength(int[] nums) {
        int len = nums.length;
        int max = 0;
        int cProd;
        int cGCD;
        int cLCM;
        int tmp;

        for (int i = 0; i < len; i++) {
            cProd = 1;
            cGCD = nums[i];
            cLCM = nums[i];

            for (int j = i; j < len; j++) {
                cProd *= nums[j];
                cGCD = GCD(cGCD, nums[j]);
                cLCM = LCM(cLCM, nums[j]);
                tmp = cGCD * cLCM;

                if (cProd > tmp) break;
                if (cProd == tmp) max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }

    public static int GCD(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = b;
            b = a % b;
            a = tmp;
        }

        return a;
    }

    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }


}