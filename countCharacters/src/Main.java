public class Main {
    public static void main(String[] args) {
        System.out.println(countCharacters(new String[] {"cat","bt","hat","tree"}, "atach"));
        System.out.println(countCharacters(new String[] {"hello","world","leetcode"}, "welldonehoneyr"));
    }

    public static int countCharacters(String[] words, String chars) {
        int len = chars.length();
        int[] cntCharsArr = new int[26];
        char[] charsArr = chars.toCharArray();
        for (char elm : charsArr)
            cntCharsArr[elm - 97]++;

        int res = 0;
        for (String word : words)
            if (word.length() <= len)
                res += checkWord(word, cntCharsArr);


        return res;
    }

    public static int checkWord(String word, int[] cntCharsArr) {
        int[] cntWordCharsArr = new int[26];
        char[] wordCharsArr = word.toCharArray();
        for (char elm : wordCharsArr)
            cntWordCharsArr[elm - 97]++;

        for (int i = 0; i < 26; i++)
            if (cntWordCharsArr[i] > cntCharsArr[i]) return 0;

        return word.length();
    }
}