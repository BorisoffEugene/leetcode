import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }

    public static boolean judgeCircle(String moves) {
        Point zeroPoint = new Point(0, 0);
        Point point = new Point(zeroPoint);
        char[] arrMove = moves.toCharArray();

        for (char move : arrMove) {
            switch (move) {
                case 'R' -> point.translate(1, 0);
                case 'L' -> point.translate(-1, 0);
                case 'U' -> point.translate(0, 1);
                case 'D' -> point.translate(0, -1);
            }
        }

        return point.equals(zeroPoint);
    }


}