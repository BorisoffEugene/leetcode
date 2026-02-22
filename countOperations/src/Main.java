public class Main {
    public static void main(String[] args) {
        System.out.println(countOperations(2, 3));
        System.out.println(countOperations(10, 10));
    }

    public static int countOperations(int num1, int num2) {
        int res = 0;

        while (num1 > 0 && num2 > 0) {
            if (num1 >= num2) num1 -= num2; else num2 -= num1;
            res++;
        }

        return res;
    }
}