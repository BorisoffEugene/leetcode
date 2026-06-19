import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(countPairs(List.of(-1,1,2,3,1), 2));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int len = nums.size();
        int cnt = 0;

        for (int i = 0; i < len - 1; i++)
            for (int j = i + 1; j < len; j++)
                if (nums.get(i) + nums.get(j) < target) cnt++;

        return cnt;
    }
}