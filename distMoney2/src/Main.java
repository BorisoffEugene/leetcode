public class Main {
    public static void main(String[] args) {
        System.out.println(distMoney(20, 3));
        System.out.println(distMoney(16, 2));
        System.out.println(distMoney(17, 2));
    }

    public static int distMoney(int money, int children) {
        if (money < children) return -1;

        money -= children;

        int res = money / 7;
        int ost = money % 7;

        if (res == children && ost == 0) return res;
        if (res >= children) return children - 1;
        if (res == children - 1 && ost == 3) return res - 1;

        return res;
    }
}