import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(prefixesDivBy5(new int[] {0, 1, 1}));
        System.out.println(prefixesDivBy5(new int[] {1, 1, 1}));
        System.out.println(prefixesDivBy5(new int[] {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1}));
    }

    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();

        int prev = 0;

        for (int i = 0; i < nums.length; i++) {
            prev = (2 * prev + nums[i]) % 5;
            res.add(prev == 0);
        }

        return res;
    }
}