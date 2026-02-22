import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
        System.out.println(hasAlternatingBits(7));
        System.out.println(hasAlternatingBits(11));
    }

    public static boolean hasAlternatingBits(int n) {
        if (n == 1) return false;
        if (n == 2) return true;

        int[] arr = new int[31];
        arr[0] = 1;
        arr[1] = 2;
        int two = 4;

        for (int i = 2; i < 31; i++, two *= 2) {
            arr[i] = two + arr[i - 2];
            if (n < arr[i]) return false;
            if (n == arr[i]) return true;
        }

        return false;
    }
}