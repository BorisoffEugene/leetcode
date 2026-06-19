public class Main {
    public static void main(String[] args) {
        System.out.println(accountBalanceAfterPurchase(9));
        System.out.println(accountBalanceAfterPurchase(15));
        System.out.println(accountBalanceAfterPurchase(10));
        System.out.println(accountBalanceAfterPurchase(11));
        System.out.println(accountBalanceAfterPurchase(0));
        System.out.println(accountBalanceAfterPurchase(100));
    }

    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 - Math.round(1.0F * purchaseAmount / 10) * 10;
    }
}