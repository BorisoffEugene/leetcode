import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = reader.readLine();
            System.out.println(calc(s));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String calc (String s) {
        if (s == null || s.isEmpty())
            return "Yes";

        char[] chars = s.toCharArray();
        int len = chars.length;
        int startCnt = 0;

        for (char c : chars)
            if (c == 'a')
                startCnt++;
            else
                break;

        if (startCnt == len)
            return "Yes";

        int endCnt = 0;

        for (int i = len - 1; i >= 0; i--)
            if (chars[i] == 'a')
                endCnt++;
            else
                break;

        if (startCnt > endCnt)
            return "No";

        int start = startCnt;
        int end = len - 1 - endCnt;

        while (start < end) {
            if (chars[start] != chars[end])
                return "No";

            start++;
            end--;
        }

        return "Yes";
    }
}