import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
        System.out.println(readBinaryWatch(9));
    }

    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        int[] bitCountH = new int[12];
        int[] bitCountM = new int[60];

        for (int i = 0; i < 12; i++) {
            bitCountH[i] = Integer.bitCount(i);
            bitCountM[i] = bitCountH[i];
        }

        for (int i = 12; i < 60; i++)
            bitCountM[i] = Integer.bitCount(i);

        for (int h = 0; h < 12; h++)
            for (int m = 0; m < 60; m++)
                if (bitCountH[h] + bitCountM[m] == turnedOn)
                    res.add(String.format("%d:%02d", h, m));

        return res;
    }
}