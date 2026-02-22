import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decimalRepresentation(537)));
        System.out.println(Arrays.toString(decimalRepresentation(102)));
        System.out.println(Arrays.toString(decimalRepresentation(6)));
    }

    public static int[] decimalRepresentation(int n) {
        if (n <= 10) return new int[] {n};

        int[] pow = {
            1, 10, 100, 1_000, 10_000, 100_000, 1_000_000, 10_000_000, 100_000_000, 1_000_000_000
        };
        int val;
        int j = 0;
        List<Integer> list = new LinkedList<>();

        while (n > 0) {
            val = n % 10;
            if (val > 0) list.addFirst(val * pow[j]);
            n /= 10;
            j++;
        }

        int len = list.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++)
            res[i] = list.get(i);

        return res;
    }
}