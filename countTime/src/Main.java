public class Main {
    public static void main(String[] args) {
        System.out.println(countTime("?5:00"));
        System.out.println(countTime("0?:0?"));
        System.out.println(countTime("??:??"));
    }

    public static int countTime(String time) {
        int res = 1;

        if (time.charAt(4) == '?') res *= 10;
        if (time.charAt(3) == '?') res *= 6;
        if (time.charAt(1) == '?')
            switch (time.charAt(0)) {
                case '0', '1' -> res *= 10;
                case '2' -> res *= 4;
                case '?' -> res *= 24;
            }
        else if (time.charAt(0) == '?') {
            if (time.charAt(1) >= '0' && time.charAt(1) <= '3')
                res *= 3;
            else
                res *= 2;
        }

        return res;
    }
}