import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
        System.out.println(minimumSum(4009));
    }

    public static int minimumSum(int num) {
        int[] res = new int[4];

        for (int i = 3; i >= 0; i--) {
            res[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(res);

        return 10 * (res[0] + res[1]) + res[2] + res[3];
    }
}