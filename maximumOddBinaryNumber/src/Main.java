public class Main {
    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("010"));
        System.out.println(maximumOddBinaryNumber("0101"));
    }

    public static String maximumOddBinaryNumber(String s) {
        int len = s.length();
        if (len == 1) return "1";

        StringBuilder sb = new StringBuilder();
        boolean isOne = false;
        char c;

        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            if (c == '1') {
                if (!isOne)
                    isOne = true;
                else
                    sb.insert(0, '1');
            } else
                sb.append('0');
        }

        sb.append('1');
        return sb.toString();
    }
}