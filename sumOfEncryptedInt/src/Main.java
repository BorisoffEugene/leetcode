public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfEncryptedInt(new int[] {1, 2, 3}));
        System.out.println(sumOfEncryptedInt(new int[] {10, 21, 31}));
    }

    public static int sumOfEncryptedInt(int[] nums) {
        int res = 0;
        for (int num : nums)
            res += encrypt(num);

        return res;
    }

    public static int encrypt(int num) {
        if (num < 10) return num;
        if (num == 1000) return 1111;

        int mult;
        if (num < 100)
            mult = 11;
        else
            mult = 111;

        int dig;
        int max = 1;
        while (num > 0) {
            dig = num % 10;
            if (dig > max) max = dig;
            num /= 10;
        }

        return mult * max;
    }
}