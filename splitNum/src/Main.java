import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(splitNum(4325));
        System.out.println(splitNum(687));
    }

    public static int splitNum(int num) {
        int len = String.valueOf(num).length();
        int[] dig = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            dig[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(dig);

        int num2 = 0;
        int num1 = 0;
        int mult = 1;
        for (int i = len - 1; i >= 0; i-=2) {
            num2 = num2 + mult * dig[i];
            if (i > 0) num1 = num1 + mult * dig[i-1];
            mult *= 10;
        }

        return num1 + num2;
    }
}