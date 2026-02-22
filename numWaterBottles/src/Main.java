public class Main {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
        System.out.println(numWaterBottles(15, 4));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int full;
        int empty = numBottles;
        int res = numBottles;

        while (empty >= numExchange) {
            full = empty / numExchange;
            res += full;
            empty = full + empty % numExchange;
        }

        return res;
    }
}