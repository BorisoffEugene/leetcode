import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOcurrences("alice is a good girl she is a good student", "a", "good")));
        System.out.println(Arrays.toString(findOcurrences("we will we will rock you", "we", "will")));
    }

    public static String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        int len = words.length;
        if (len < 3) return new String[] {};

        List<String> res = new ArrayList<>();
        for (int i = 2; i < len; i++)
            if (first.equals(words[i - 2]) && second.equals(words[i - 1]))
                res.add(words[i]);

        return res.toArray(new String[0]);
    }
}