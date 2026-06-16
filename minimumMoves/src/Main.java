public class Main {
    public static void main(String[] args) {
        System.out.println(minimumMoves("XXX"));
        System.out.println(minimumMoves("XXOX"));
        System.out.println(minimumMoves("OOOO"));
        System.out.println(minimumMoves("OXOX"));
        System.out.println(minimumMoves("XXXOOXXX"));
    }

    public static int minimumMoves(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        int res = 0;

        for (int i = 0; i < len; i++)
            if (chars[i] == 'X') {
                res++;
                i += 2;
            }

        return res;
    }
}