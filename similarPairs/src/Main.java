import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(similarPairs(new String[]{"aba","aabb","abcd","bac","aabc"}));
        System.out.println(similarPairs(new String[]{"aabb","ab","ba"}));
        System.out.println(similarPairs(new String[]{"nba","cba","dba"}));
    }

    public static int similarPairs(String[] words) {
        int res = 0;
        if (words.length == 1) return res;

        boolean[][] checks = new boolean[words.length][26];

        // Заполняем первое слово
        char[] chars = words[0].toCharArray();
        for (char c : chars)
            checks[0][c - 'a'] = true;

        // Первый прогона с заполнением
        for (int j = 1; j < words.length; j++) {
            chars = words[j].toCharArray();
            for (char c : chars)
                checks[j][c - 'a'] = true;
            if (Arrays.equals(checks[0], checks[j])) res++;
        }

        // Остальные прогоны
        int len = words.length - 1;
        for (int i = 1;  i < len; i++)
            for (int j = i + 1; j < words.length; j++)
                if (Arrays.equals(checks[i], checks[j])) res++;

        return res;
    }
}