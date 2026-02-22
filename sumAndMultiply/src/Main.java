public class Main {
    public static void main(String[] args) {
        System.out.println(sumAndMultiply(10203004));
        System.out.println(sumAndMultiply(1000));
    }

    public static long sumAndMultiply(int n) {
        if (n == 0) return 0;

        char[] arr = Integer.toString(n).toCharArray();
        StringBuilder sb = new StringBuilder();
        long sum = 0L;

        for (char c : arr)
            if (c != '0') {
                sb.append(c);
                sum += (c - 48);
            }

        long x = Long.parseLong(sb.toString());

        return x * sum;
    }
}