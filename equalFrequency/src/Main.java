public class Main {
    public static void main(String[] args) {
        System.out.println(equalFrequency("abcc"));
        System.out.println(equalFrequency("aazz"));
        System.out.println(equalFrequency("bac"));
        System.out.println(equalFrequency("abbcc"));
        System.out.println(equalFrequency("cbccca"));
    }

    public static boolean equalFrequency(String word) {
        int[] freq = new int[26];
        char[] chars = word.toCharArray();
        int max = 1;
        int cntMax = 0;
        int cntOther = 0;

        for (char c : chars)
            max = Math.max(max, ++freq[c - 'a']);

        if (max == 1) return true;

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            if (freq[i] == max) cntMax++; else cntOther++;
        }

        return cntOther > 0;
    }
}