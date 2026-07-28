import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int[][] freq;

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
        System.out.println(groupAnagrams(new String[] {""}));
        System.out.println(groupAnagrams(new String[] {"a"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        freq = new int[strs.length][27];

        addFreq(strs, 0);
        List<String> list = new ArrayList<>();
        list.add(strs[0]);
        for (int j = 1; j < strs.length; j++) {
          addFreq(strs, j);
          addAnagram(list, strs, 0, j);
        }

        List<List<String>> res = new ArrayList<>();
        res.add(list);

        for (int i = 1; i < strs.length; i++)
            if (strs[i] != null) {
                list = new ArrayList<>();
                list.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++)
                    if (strs[j] != null) addAnagram(list, strs, i, j);

                res.add(list);
            }

        return res;
    }

    public static void addAnagram(List<String> list, String[] strs, int i, int j) {
        if (isAnagram(i, j)) {
            list.add(strs[j]);
            strs[j] = null;
        }
    }

    public static boolean isAnagram(int i, int j) {
        if (freq[i][26] != freq[j][26]) return false;

        for (int k = 0; k < 26; k++)
            if (freq[i][k] != freq[j][k]) return false;

        return true;
    }

    public static void addFreq(String[] strs, int i) {
        char[] chars = strs[i].toCharArray();
        freq[i][26] = chars.length;

        for (char c : chars)
            freq[i][c - 'a']++;
    }
}