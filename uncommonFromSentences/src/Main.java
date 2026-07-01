import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
        System.out.println(Arrays.toString(uncommonFromSentences("apple apple", "banana")));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        int cnt = 0;
        int val;

        for (String s : arr1) {
            val = map.getOrDefault(s, 0);
            map.put(s, val + 1);

            if (val == 0)
                cnt++;
            else if (val == 1)
                cnt--;
        }

        for (String s : arr2) {
            val = map.getOrDefault(s, 0);
            map.put(s, val + 1);

            if (val == 0)
                cnt++;
            else if (val == 1)
                cnt--;
        }

        String[] res = new String[cnt];
        int i = 0;
        for (var entry : map.entrySet())
            if (entry.getValue() == 1)
                res[i++] = entry.getKey();

        return res;
    }
}