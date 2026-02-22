public class Main {
    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
    }

    public static int titleToNumber(String columnTitle) {
        char[] arr = columnTitle.toCharArray();
        int res = 0;

        for (int i = arr.length - 1; i >= 0; i--)
            res += ((arr[i] - 65) % 26 + 1) * Math.pow(26, arr.length - 1 - i);

        return res;
    }
}