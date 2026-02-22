import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(List.of("London","New York"));
        paths.add(List.of("New York","Lima"));
        paths.add(List.of("Lima","Sao Paulo"));

        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();

        for (List<String> path : paths)
            set.add(path.getFirst());

        String res;
        for (List<String> path : paths) {
            res = path.getLast();
            if (set.add(res)) return res;
        }

        return null;
    }
}