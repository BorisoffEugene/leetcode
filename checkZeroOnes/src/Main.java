public class Main {
    public static void main(String[] args) {
        System.out.println(checkZeroOnes("1101"));
        System.out.println(checkZeroOnes("111000"));
        System.out.println(checkZeroOnes("110100010"));
        System.out.println(checkZeroOnes("01"));
    }

    public static boolean checkZeroOnes(String s) {
        int len = s.length();
        if (len == 1) return s.charAt(0) == '1';

        int cntOne = s.charAt(0) == '1' ? 1 : 0;
        int cntZero = 1 - cntOne;
        int maxOne = cntOne;
        int maxZero = cntZero;
        
        for (int i = 1; i < len; i++)
            if (s.charAt(i) == '1') {
                if (s.charAt(i - 1) == '1') cntOne++; else cntOne = 1;
                if (cntOne > maxOne) maxOne = cntOne;
            } else {
                if (s.charAt(i - 1) == '0') cntZero++; else cntZero = 1;
                if (cntZero > maxZero) maxZero = cntZero;
            }

        return maxOne > maxZero;
    }
}