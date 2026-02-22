import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divideString("abcdefghi", 3, 'x')));
        System.out.println(Arrays.toString(divideString("abcdefghij", 3, 'x')));
    }

    public static String[] divideString(String s, int k, char fill) {
        int lenS = s.length();
        int lenA = lenS / k;
        int ost = lenS % k;
        if (ost != 0) lenA++;
        String[] res = new String[lenA];
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (int i = 0; i <= lenS - k; i += k) {
            for (int j = i; j < i + k; j++)
                sb.append(s.charAt(j));
            res[idx++] = sb.toString();
            sb.setLength(0);
        }

        if (ost == 0) return res;

        for (int i = lenS - ost; i < lenS; i++)
            sb.append(s.charAt(i));
        for (int i = 0; i < k - ost; i++)
            sb.append(fill);

        res[idx] = sb.toString();

        return res;
    }
}