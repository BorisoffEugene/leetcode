public class Main {
    public static void main(String[] args) {
        System.out.println(rearrangeString("aabc", 'a', 'c'));
        System.out.println(rearrangeString("dcab", 'd', 'b'));
        System.out.println(rearrangeString("axe", 'o', 'x'));
    }

    public static String rearrangeString(String s, char x, char y) {
        char[] chars = s.toCharArray();
        int cntX = 0;
        int cntY = 0;
        char[] res = new char[chars.length];
        int i = 0;

        for (char c :chars)
            if (c == x)
                cntX++;
            else if (c == y)
                cntY++;
            else
                res[i++] = c;

        for (int j = 0; j < cntY; j++)
            res[i++] = y;

        for (int j = 0; j < cntX; j++)
            res[i++] = x;

        return new String(res);
    }
}