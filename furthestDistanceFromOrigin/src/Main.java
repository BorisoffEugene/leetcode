public class Main {
    public static void main(String[] args) {
        System.out.println(furthestDistanceFromOrigin("L_RL__R"));
        System.out.println(furthestDistanceFromOrigin("_R__LL_"));
        System.out.println(furthestDistanceFromOrigin("_______"));
    }

    public static int furthestDistanceFromOrigin(String moves) {
        char[] chars = moves.toCharArray();
        int cntL = 0;
        int cntR = 0;
        int cnt_ = 0;

        for (char c : chars)
            switch (c) {
                case 'L' -> cntL++;
                case 'R' -> cntR++;
                case '_' -> cnt_++;
            }

        if (cntL > cntR) cntL += cnt_; else cntR += cnt_;

        return Math.abs(cntL - cntR);
    }
}