public class Main {
    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
        System.out.println(sortString("rat"));
    }

    public static String sortString(String s) {
        int[] freq = new int[26];
        int len = s.length();

        for (int i = 0; i < len; i++)
            freq[s.charAt(i) - 'a']++;

        StringBuilder sb = new StringBuilder();
        int azZeroCnt = 0;
        int zaZeroCnt = 0;

        while (true) {
            if (azZeroCnt < 26) {
                azZeroCnt = 0;
                for (int i = 0; i < 26; i++)
                    if (freq[i] > 0) {
                        sb.append((char)('a' + i));
                        freq[i]--;
                    } else
                        azZeroCnt++;
            }

            if (zaZeroCnt < 26) {
                zaZeroCnt = 0;
                for (int i = 25; i >= 0; i--)
                    if (freq[i] > 0) {
                        sb.append((char)('a' + i));
                        freq[i]--;
                    } else
                        zaZeroCnt++;
            }

            if (azZeroCnt == 26 && zaZeroCnt == 26) break;
        }

        return sb.toString();
    }
}