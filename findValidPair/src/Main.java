public class Main {
    public static void main(String[] args) {
        System.out.println(findValidPair("2523533"));
        System.out.println(findValidPair("221"));
        System.out.println(findValidPair("22"));
    }

    public static String findValidPair(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[10];

        for (char c : chars)
            freq[c - '0']++;

        for (int i = 0; i < chars.length - 1; i++)
            if (
                    chars[i] != chars[i + 1] &&
                    freq[chars[i] - '0'] == (chars[i] - '0') &&
                    freq[chars[i + 1] - '0'] == (chars[i + 1] - '0')
            )
                return String.valueOf(new char[]{chars[i], chars[i + 1]});

        return "";
    }
}