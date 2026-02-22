public class Main {
    public static void main(String[] args) {
        System.out.println(minimumFlips(7));
        System.out.println(minimumFlips(10));
        System.out.println(minimumFlips(1));
        System.out.println(minimumFlips(2));
        System.out.println(minimumFlips(3));
        System.out.println(minimumFlips(4));
    }

    public static int minimumFlips(int n) {
        if (n == 1) return 0;

        String str = Integer.toString(n, 2);
        int len = str.length() - 1;
        int end = (len + 1) / 2;
        int res = 0;

        for (int i = 0; i < end; i++)
            if (str.charAt(i) != str.charAt(len - i)) res += 2;

        return res;
    }
}