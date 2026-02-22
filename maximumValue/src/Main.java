public class Main {
    public static void main(String[] args) {
        System.out.println(maximumValue(new String[] {"alic3","bob","3","4","00000"}));
        System.out.println(maximumValue(new String[] {"1","01","001","0001"}));
    }

    public static int maximumValue(String[] strs) {
        int res = 0;
        int val;

        for (String str : strs) {
            val = value(str);
            if (res < val) res = val;
        }

        return res;
    }

    public static int value(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return str.length();
        }
    }
}