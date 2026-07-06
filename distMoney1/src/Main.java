public class Main {
    public static void main(String[] args) {

    }

    public static int distMoney(int money, int children) {
        int res = money / 8;
        if (res > children) return children - 1;

        int ostMoney = money - res;
        if (res == children && ostMoney == 0) return children;

        int ostChildren = children - res;


    }
}