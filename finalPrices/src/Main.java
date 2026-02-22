import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[] {8,4,6,2,3})));
        System.out.println(Arrays.toString(finalPrices(new int[] {1,2,3,4,5})));
        System.out.println(Arrays.toString(finalPrices(new int[] {10,1,1,6})));
    }

    public static int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] res = new int[len];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            res[i] += prices[i];

            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()])
                res[stack.pop()] -= prices[i];

            stack.push(i);
        }

        return res;
    }
}