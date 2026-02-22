public class Main {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
    }

    public static boolean checkRecord(String s) {
        int len = s.length();
        int cntA = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'A') if (++cntA > 1) return false;
            if (i + 2 < len) if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') return false;
        }

        return true;
    }
}