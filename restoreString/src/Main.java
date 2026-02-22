import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
        System.out.println(restoreString("abc", new int[] {0,1,2}));
    }

    public static String restoreString(String s, int[] indices) {
        TreeMap<Integer, Character> map = new TreeMap<>();
        char[] arrS = s.toCharArray();

        for (int i = 0; i < indices.length; i++)
            map.put(indices[i], arrS[i]);

        return map.values().stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}