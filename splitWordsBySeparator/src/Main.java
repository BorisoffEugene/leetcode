import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(splitWordsBySeparator(Arrays.asList(new String[] {"one.two.three","four.five","six"}), '.'));
        System.out.println(splitWordsBySeparator(Arrays.asList(new String[] {"$easy$","$problem$"}), '$'));
        System.out.println(splitWordsBySeparator(Arrays.asList(new String[] {"|||"}), '|'));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        String sep = "\\" + separator;
        List<String> res = new ArrayList<>();
        String[] arr;

        for (String word : words) {
            arr = word.split(sep);
            for(String str : arr)
                if (!str.isEmpty()) res.addLast(str);
        }

        return res;
    }
}