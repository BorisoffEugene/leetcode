public class Main {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        char[] chars = s.toCharArray();
        int len = chars.length;
        int cLen = 2 * numRows - 2;
        int di;
        StringBuilder res = new StringBuilder();

        for (int r = 0; r < numRows; r++)
            for (int j = 0; j + r < len; j+= cLen) {
                res.append(chars[j + r]);
                di = j - r + cLen;
                if (r != 0 && r != numRows - 1 && len > di)
                    res.append(chars[di]);
            }

        return res.toString();
    }
}