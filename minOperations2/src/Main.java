import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(minOperations(List.of(3,1,5,4,2), 2));
    }

    public static int minOperations(List<Integer> nums, int k) {
        boolean[] check = new boolean[k + 1];
        int len = nums.size() - 1;
        int res = 0;
        int num;
        int cnt = 0;

        for (int i = len; i >= 0; i--) {
            num = nums.get(i);
            res++;

            if (num <= k && !check[num]) {
                check[num] = true;
                cnt++;
                if (cnt == k) break;
            }
        }

        return res;
    }
}