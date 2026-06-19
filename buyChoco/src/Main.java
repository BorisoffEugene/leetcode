import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(buyChoco(new int[] {1,2,2}, 3));
        System.out.println(buyChoco(new int[] {3,2,3}, 3));
    }

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int ost = money - prices[0] - prices[1];

        return ost < 0 ? money : ost;
    }
}