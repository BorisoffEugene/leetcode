import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringMatching(new String[] {"mass","as","hero","superhero"}));
        System.out.println(stringMatching(new String[] {"leetcode","et","code"}));
        System.out.println(stringMatching(new String[] {"blue","green","bu"}));
    }

    public static List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        String source = ";" + String.join(";", words) + ";";

        for (String word : words)
            if (check(word, source)) list.add(word);

        return list;
    }

    public static boolean check(String word, String source) {
        int pos1 = source.indexOf(";" + word + ";");
        int pos2 = source.indexOf(word);

        if (pos2 != pos1 + 1) return true;

        return source.indexOf(word, pos2 + 1) != -1;
    }
}