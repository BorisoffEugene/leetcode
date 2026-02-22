public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps(int num) {
        int res = 0;

        while (num != 0) {
            if ((num & 1) == 1) num -= 1; else num >>= 1;
            res++;
        }

        return res;
    }
}