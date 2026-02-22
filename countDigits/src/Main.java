public class Main {
    public static void main(String[] args) {
        System.out.println(countDigits(7));
        System.out.println(countDigits(121));
        System.out.println(countDigits(1248));
    }

    public static int countDigits(int num) {
        if (num < 10) return 1;

        int tmp = num;
        int dig;
        int[] arr = new int[10];
        int res = 0;

        while (tmp > 0) {
            dig = tmp % 10;

            if (arr[dig] == 0) {
                if (num % dig == 0) {
                    res++;
                    arr[dig] = 1;
                } else {
                    arr[dig] = -1;
                }
            } else if (arr[dig] == 1) {
                res++;
            }

            tmp = tmp / 10;
        }

        return res;
    }
}