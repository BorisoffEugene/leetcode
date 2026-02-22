import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
        System.out.println(selfDividingNumbers(47, 85));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++)
            if (check(i)) list.add(i);

        return list;
    }

    public static boolean check(int num) {
        if (num <= 9) return true;

        char[] arr = Integer.toString(num).toCharArray();
        for (char elm : arr) {
            if (elm == '0') return false;
            if (num % (elm - 48) != 0) return false;
        }

        return true;
    }
}