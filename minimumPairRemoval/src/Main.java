import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumPairRemoval(new int[] {5,2,3,1}));
        System.out.println(minimumPairRemoval(new int[] {1,2,2}));
    }

    public static int minimumPairRemoval(int[] nums) {
        int res = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() > num) {
                num += stack.pop();
                res++;
            }

            stack.push(num);
        }

        return res;
    }
}