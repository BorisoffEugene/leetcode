public class Main {
    public static void main(String[] args) {
        System.out.println(isFascinating(192));
        System.out.println(isFascinating(100));
        System.out.println(isFascinating(999));
    }

    public static boolean isFascinating(int n) {
        if (n % 10 == 0) return false;
        if ((n / 10) % 10 == 0) return false;

        String str = "" + n + 2*n + 3*n;
        int len = str.length();
        if (len != 9) return false;

        int[] arr = new int[10];
        int j;

        for (int i = 0; i < len; i++) {
            j = str.charAt(i) - 48;
            if (j == 0) return false;
            arr[j]++;
            if (arr[j] > 1) return false;
        }

        return true;
    }
}