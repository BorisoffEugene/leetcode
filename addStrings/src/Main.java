public class Main {
    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
        System.out.println(addStrings("456", "77"));
        System.out.println(addStrings("0", "0"));
        System.out.println(addStrings("123", "11"));
    }

    public static String addStrings(String num1, String num2) {
        if (num1.equals("0")) return num2;
        if (num2.equals("0")) return num1;

        int maxLen = Math.max(num1.length(), num2.length());
        num1 = fillLeftZero(num1, maxLen);
        num2 = fillLeftZero(num2, maxLen);
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int mem = 0;
        String res = "";

        for (int i = maxLen - 1; i >= 0; i--) {
            int ires = arr1[i] - 48 + arr2[i] - 48 + mem;
            mem = ires / 10;
            res =  (ires % 10) + res;
        }

        if (mem == 1) res = "1" + res;

        return res;
    }

    public static String fillLeftZero(String str, int len) {
        int delta = len - str.length();
        if (delta <= 0) return str;

        String res = str;
        for (int i = 1; i <= delta; i++)
            res = "0" + res;

        return res;
    }


}