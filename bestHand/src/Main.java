import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(bestHand(new int[] {13,2,3,1,9}, new char[] {'a','a','a','a','a'}));
        System.out.println(bestHand(new int[] {4,4,2,4,4}, new char[] {'d','a','a','b','c'}));
        System.out.println(bestHand(new int[] {10,10,2,12,9}, new char[] {'a','b','c','a','d'}));
    }

    public static String bestHand(int[] ranks, char[] suits) {
        HashSet<Character> set = new HashSet<>();
        for (char suit : suits)
            set.add(suit);
        if (set.size() == 1) return "Flush";

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int rank : ranks)
            map.put(rank, map.getOrDefault(rank, 0) + 1);

        int max = 0;
        for (int val : map.values())
            if (val > max) max = val;

        if (max >= 3) return "Three of a Kind";
        if (max == 2) return "Pair";
        return "High Card";
    }
}