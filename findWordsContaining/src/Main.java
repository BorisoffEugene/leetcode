import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[] {"leet","code"}, 'e'));
        System.out.println(findWordsContaining(new String[] {"abc","bcd","aaaa","cbc"}, 'a'));
        System.out.println(findWordsContaining(new String[] {"abc","bcd","aaaa","cbc"}, 'z'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++)
            if (words[i].indexOf(x) != -1) res.add(i);

        return res;
    }
}