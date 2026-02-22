import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1,2,0,0}, 34));
        System.out.println(addToArrayForm(new int[]{2,7,4}, 181));
        System.out.println(addToArrayForm(new int[]{2,1,5}, 806));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new LinkedList<>();
        boolean is_zero = false;
        int one = 0;
        int val;

        for (int i = num.length - 1; i >= 0; i--) {
            val = num[i] + one;
            if (!is_zero) {
                val = val + k % 10;
                k = k / 10;
                is_zero = k == 0;
            }
            one = val / 10;
            list.addFirst(val % 10);
        }

        while (!is_zero) {
            val = one + k % 10;
            k = k / 10;
            is_zero = k == 0;
            one = val / 10;
            list.addFirst(val % 10);
        }

        if (one == 1) list.addFirst(one);

        return list;
    }
}