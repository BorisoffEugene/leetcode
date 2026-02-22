public class Main {
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("1001"));
        System.out.println(checkOnesSegment("110"));
        System.out.println(checkOnesSegment("1"));
        System.out.println(checkOnesSegment("10"));
    }

    public static boolean checkOnesSegment(String s) {
        int len = s.length();
        boolean isNotFindZero = true;
        if (len == 1) return s.charAt(0) == '1';

        for (int i = 1; i < len; i++)
            if (isNotFindZero) {
                if (s.charAt(i) == '0') isNotFindZero = false;
            } else {
                if (s.charAt(i) == '1') return false;
            }

        return true;
    }
}