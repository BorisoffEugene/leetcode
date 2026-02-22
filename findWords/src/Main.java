import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello","Alaska","Dad","Peace"})));
        System.out.println(Arrays.toString(findWords(new String[]{"omk"})));
        System.out.println(Arrays.toString(findWords(new String[]{"adsdf","sfd"})));
    }

    public static String[] findWords(String[] words) {
        final String FIRST_ROW = "qwertyuiop";
        final String SECOND_ROW = "asdfghjkl";
        final String THIRD_ROW = "zxcvbnm";

        String curRow = "";
        List<String> res = new ArrayList<>();

        for (String str : words) {
            String lowStr = str.toLowerCase();

            if (FIRST_ROW.indexOf(lowStr.charAt(0)) != -1)
                curRow = FIRST_ROW;
            else if (SECOND_ROW.indexOf(lowStr.charAt(0)) != -1)
                curRow = SECOND_ROW;
            else if (THIRD_ROW.indexOf(lowStr.charAt(0)) != -1)
                curRow = THIRD_ROW;

            char[] arr = lowStr.toCharArray();
            boolean isFind = true;
            for (char c : arr)
                if (curRow.indexOf(c) == -1) {isFind = false; break;}

            if (isFind) res.add(str);
        }

        return res.toArray(new String[0]);
    }
}