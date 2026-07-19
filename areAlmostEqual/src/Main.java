public class Main {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
        System.out.println(areAlmostEqual("attack", "defend"));
        System.out.println(areAlmostEqual("kelb", "kelb"));
        System.out.println(areAlmostEqual("aa", "ac"));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int cnt = 0;
        char a1 = '0';
        char a2 = '0';

        for (int i = 0; i < c1.length; i++)
            if (c1[i] != c2[i]) {
                if (cnt == 2) return false;

                cnt++;
                if (cnt == 1) {
                    a1 = c1[i];
                    a2 = c2[i];
                } else if (c2[i] != a1 || c1[i] != a2)
                    return false;
            }

        return cnt == 0 || cnt == 2;
    }
}