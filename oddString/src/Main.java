import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(oddString(new String[]{"adc","wzy","abc"}));
        System.out.println(oddString(new String[]{"aaa","bob","ccc","ddd"}));
        System.out.println(oddString(new String[]{"aaa","ccc","ddd","bob"}));
    }

    public static String oddString(String[] words) {
        int len = words[0].length() - 1;
        int[][] arr = new int[3][len];
        char[] chars;

        for (int k = 0; k < 3; k++) {
            chars = words[k].toCharArray();
            for (int i = 1; i <= len; i++)
                arr[k][i - 1] = chars[i] - chars[i - 1];
        }

        if (Arrays.equals(arr[0], arr[1]) && !Arrays.equals(arr[1], arr[2]))
            return words[2];
        if (!Arrays.equals(arr[0], arr[1]) && Arrays.equals(arr[1], arr[2]))
            return words[0];
        if (!Arrays.equals(arr[0], arr[1]) && Arrays.equals(arr[0], arr[2]))
            return words[1];

        for (int k = 3; k < words.length; k++)
            for (int i = 1; i <= len; i++) {
                arr[1][i - 1] = words[k].charAt(i) - words[k].charAt(i - 1);
                if (arr[1][i - 1] != arr[0][i - 1]) return words[k];
            }

        return "";
    }

}