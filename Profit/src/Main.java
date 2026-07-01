import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cnt = scanner.nextInt();

            int minPrice1 = Integer.MAX_VALUE;
            int profit1 = 0;
            int minCost2 = Integer.MAX_VALUE;
            int profit2 = 0;
            int price;

            for (int i = 0; i < cnt; i++) {
                price = scanner.nextInt();
                minPrice1 = Math.min(minPrice1, price);
                profit1 = Math.max(profit1, price - minPrice1);
                minCost2 = Math.min(minCost2, price - profit1);
                profit2 = Math.max(profit2, price - minCost2);
            }

            System.out.println(profit2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}