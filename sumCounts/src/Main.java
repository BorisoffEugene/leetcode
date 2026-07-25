import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumCounts(List.of(1,2,1)));
        System.out.println(sumCounts(List.of(1,1)));
    }

    public static int sumCounts(List<Integer> nums) {
        int len = nums.size();
        boolean[] exists = new boolean[101];
        int cnt;
        int num;
        int res = 0;

        for (int i = 0; i < len; i++) {
            exists = new boolean[101];
            cnt = 0;

            for (int j = i; j < len; j++) {
                num = nums.get(j);

                if (!exists[num]) {
                    cnt++;
                    exists[num] = true;
                }

                res += cnt * cnt;
            }
        }

        return res;
    }
}