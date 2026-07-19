public class Main {
    public static void main(String[] args) {
        System.out.println(countVowelSubstrings("aeiouu"));
        System.out.println(countVowelSubstrings("unicornarihan"));
        System.out.println(countVowelSubstrings("cuaieuouac"));
    }

    public static int countVowelSubstrings(String word) {
        int cnt = 0;
        char[] chars = word.toCharArray();
        int len = chars.length;
        int msk;
        char c;

        for (int i = 0; i < len - 4; i++) {
            msk = 0;
            for (int j = i; j < len; j++) {
                c = chars[j];

                if (c == 'a') msk |= 1;
                else if (c == 'e') msk |= 2;
                else if (c == 'i') msk |= 4;
                else if (c == 'o') msk |= 8;
                else if (c == 'u') msk |= 16;
                else break;

                if (msk == 31) cnt++;
            }
        }

        return cnt;
    }
}