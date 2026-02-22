public class Main {
    public static void main(String[] args) {
        System.out.println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
        System.out.println(areNumbersAscending("hello world 5 x 5"));
        System.out.println(areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
    }

    public static boolean areNumbersAscending(String s) {
        int len = s.length() - 1;
        int dig;
        int val = 0;
        int prevVal = Integer.MAX_VALUE;
        int ten = 1;

        for (int i = len; i >= 0; i--) {
            dig = s.charAt(i) - 48;
            if (dig >= 0 && dig <= 9) {
                do {
                    val += dig * ten;
                    ten *= 10;
                    i--;
                    if (i == -1) break;
                    dig = s.charAt(i) - 48;
                } while (dig != -16);

                if (val >= prevVal) return false;

                prevVal = val;
                val = 0;
                ten = 1;
            }
        }

        return true;
    }
}