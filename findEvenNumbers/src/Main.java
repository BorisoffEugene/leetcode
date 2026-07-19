import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{2,1,3,0})));
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{2,2,8,8,2})));
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{3,7,5})));
    }

    public static int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int tmp100;
        int tmp10;

        int[] freq = new int[10];
        for (int d : digits)
            freq[d]++;

        for (int d100 = 1; d100 < 10; d100++) {
            if (freq[d100] == 0) continue;
            freq[d100]--;
            tmp100 = d100 * 100;

            for (int d10 = 0; d10 < 10; d10++) {
                if (freq[d10] == 0) continue;
                freq[d10]--;
                tmp10 = d10 * 10;

                for (int d1 = 0; d1 < 9; d1 += 2) {
                    if (freq[d1] == 0) continue;

                    list.add(tmp100 + tmp10 + d1);
                }

                freq[d10]++;
            }

            freq[d100]++;
        }

        int[] res = new int[list.size()];
        int i = 0;
        for (int l : list) res[i++] = l;

        return res;
    }
}