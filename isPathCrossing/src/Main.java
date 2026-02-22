import java.awt.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPathCrossing("NES"));
        System.out.println(isPathCrossing("NESWW"));
    }

    public static boolean isPathCrossing(String path) {
        HashSet<Point> set = new HashSet<>();
        Point curPoint = new Point(0, 0);
        set.add(curPoint);

        char[] chars = path.toCharArray();
        for (char ch : chars) {
            curPoint = move(curPoint, ch);
            if (!set.add(curPoint)) return true;
        }

        return false;
    }

    public static Point move(Point point, char ch) {
        Point res = new Point(point);
        switch (ch) {
            case 'N' -> res.translate(0, 1);
            case 'S' -> res.translate(0, -1);
            case 'E' -> res.translate(1, 0);
            case 'W' -> res.translate(-1, 0);
        }

        return res;
    }
}