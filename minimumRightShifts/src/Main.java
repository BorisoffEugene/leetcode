import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumRightShifts(List.of(3,4,5,1,2)));
        System.out.println(minimumRightShifts(List.of(1,3,5)));
        System.out.println(minimumRightShifts(List.of(2,1,4)));
    }

    public static int minimumRightShifts(List<Integer> nums) {
        int len = nums.size();
        if (len == 1) return 0;

        int idx = -1;
        if (nums.getFirst() < nums.getLast()) idx = 0;

        for (int i = 1; i < len; i++)
            if (nums.get(i) < nums.get(i - 1)) {
                if (idx > -1) return -1;
                idx = i;
            }

        if (idx == 0) return 0;
        return len - idx;
    }
}