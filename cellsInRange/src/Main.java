import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(cellsInRange("K1:L2"));
        System.out.println(cellsInRange("A1:F1"));
    }

    public static List<String> cellsInRange(String s) {
        char cStart = s.charAt(0);
        char cEnd = s.charAt(3);
        char rStart = s.charAt(1);
        char rEnd = s.charAt(4);

        char[] chars = new char[2];
        List<String> res = new ArrayList<>();

        for (char c = cStart; c <= cEnd; c++) {
            chars[0] = c;
            for (char r = rStart; r <= rEnd; r++) {
                chars[1] = r;
                res.add(new String(chars));
            }
        }

        return res;
    }
}