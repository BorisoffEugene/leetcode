public class Main {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex", "aaleex"));
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int lName = name.length();
        int lTyped = typed.length();

        if (lTyped < lName) return false;
        if (lTyped == lName) return name.equals(typed);

        int[][] cName = convertWord(name, lName);
        int[][] cTyped = convertWord(typed, lTyped);
        int idx = 0;

        while (idx < lName) {
            if (cName[idx][1] == 0 && cTyped[idx][1] == 0) return true;
            if (cName[idx][1] * cTyped[idx][1] == 0) return false;
            if (cName[idx][0] != cTyped[idx][0]) return false;
            if (cName[idx][1] > cTyped[idx][1]) return false;

            idx++;
        }

        return cTyped[idx][1] == 0;
    }

    public static int[][] convertWord(String word, int len) {
        int[][] res = new int[len][2];

        char[] chars = word.toCharArray();
        int c = chars[0];
        int cnt = 1;
        int idx = 0;

        for (int i = 1; i < len; i++)
            if (chars[i] == c)
                cnt++;
            else {
                res[idx][0] = c;
                res[idx][1] = cnt;
                idx++;
                c = chars[i];
                cnt = 1;
            }

        res[idx][0] = c;
        res[idx][1] = cnt;

        return res;
    }
}