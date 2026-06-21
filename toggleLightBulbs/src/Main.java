import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(toggleLightBulbs(List.of(10,30,20,10)));
        System.out.println(toggleLightBulbs(List.of(100,100)));
    }

    public static List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] on = new boolean[101];

        for (int bulb : bulbs)
            on[bulb] = !on[bulb];

        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 101; i++)
            if (on[i]) res.add(i);

        return res;
    }
}