public class Main {
    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("51230100"));
        System.out.println(removeTrailingZeros("123"));
        System.out.println(removeTrailingZeros("0"));
    }

    public static String removeTrailingZeros(String num) {
        int len = num.length() - 1;
        int pos = -1;

        for (int i = len; i >= 0; i--)
            if (num.charAt(i) > '0') {
                pos = i + 1;
                break;
            }

        if (pos == -1) return "";
        return num.substring(0, pos);
    }
}