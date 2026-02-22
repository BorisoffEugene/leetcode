public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("D"));
    }

    public static int romanToInt(String s) {
        int len = s.length();
        int res = 0;
        int tmp = 0;
        int val1;
        int val2 = symbolToValue(s.charAt(len - 1));

        for (int i = 0; i < len - 1; i++) {
            val1 = symbolToValue(s.charAt(i));
            val2 = symbolToValue(s.charAt(i + 1));
            tmp += val1;
            if (val1 > val2) {
                res += tmp;
                tmp = 0;
            } else if (val1 < val2) {
                res -= tmp;
                tmp = 0;
            }
        }

        res += tmp + val2;

        return res;
    }

    private static int symbolToValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }

        return 0;
    }
}