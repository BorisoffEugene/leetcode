import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasGroupsSizeX(new int[] {1,2,3,4,4,3,2,1}));
        System.out.println(hasGroupsSizeX(new int[] {1,1,1,2,2,2,3,3}));
        System.out.println(hasGroupsSizeX(new int[] {1}));
        System.out.println(hasGroupsSizeX(new int[] {0,0,0,0,0,1,1,2,3,4}));
        System.out.println(hasGroupsSizeX(new int[] {1,1,2,2,2,2}));
        System.out.println(hasGroupsSizeX(new int[] {1,1,1,1,2,2,2,2,2,2}));
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 1) return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int elm : deck)
            map.put(elm, map.getOrDefault(elm, 0) + 1);

        int min = Collections.min(map.values());
        if (min == 1) return false;

        boolean isGroup;
        for (int i = 2; i <= min; i++) {
            isGroup = true;
            for (int val : map.values())
                if (val % i != 0) {
                    isGroup = false;
                    break;
                }
            if (isGroup) return true;
        }

        return false;
    }
}