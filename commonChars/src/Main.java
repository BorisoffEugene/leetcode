import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(commonChars(new String[] {"bella","label","roller"}));
        System.out.println(commonChars(new String[] {"cool","lock","cook"}));
    }

    public static List<String> commonChars(String[] words) {
        int[] firstArr = new int[26];
        int[] otherArr = new int[26];

        word2arr(words[0], firstArr);

        for (int i = 1; i < words.length; i++) {
            word2arr(words[i], otherArr);
            minArr(firstArr, otherArr);
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 1; j <= firstArr[i]; j++) {
                list.add(String.valueOf((char)(i + 97)));
            }
        }

        return list;
    }

    public static void word2arr(String word, int[] arr) {
        int len = word.length();
        Arrays.fill(arr, 0);

        for (int i = 0; i < len; i++)
            arr[word.charAt(i) - 97]++;
    }

    public static void minArr(int[] firstArr, int[] otherArr) {
        for (int i = 0; i < 26; i++)
            firstArr[i] = Math.min(firstArr[i], otherArr[i]);
    }
}