public class Main {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
        System.out.println(pivotInteger(1));
        System.out.println(pivotInteger(4));
    }

    public static int pivotInteger(int n) {
        int tmp = (n * (n + 1)) / 2;
        int res = (int)Math.sqrt(tmp);
        if (res * res == tmp) return res;
        return -1;
    }
}