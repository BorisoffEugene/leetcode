public class Main {
    public static void main(String[] args) {
        System.out.println(removeZeros(1020030));
        System.out.println(removeZeros(1));
    }

    public static long removeZeros(long n) {
        char[] arr = Long.toString(n).toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : arr)
            if (c != '0') sb.append(c);

        return Long.parseLong(sb.toString());
    }
}