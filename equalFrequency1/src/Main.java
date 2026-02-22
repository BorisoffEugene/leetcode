public class Main {
    public static void main(String[] args) {
        System.out.println(equalFrequency("abcc"));
        System.out.println(equalFrequency("aazz"));
        System.out.println(equalFrequency("cbccca"));
        System.out.println(equalFrequency("abbcc"));
        System.out.println(equalFrequency("aca"));
        System.out.println(equalFrequency("cccd"));
        System.out.println(equalFrequency("cbccca"));
    }

    public static boolean equalFrequency(String word) {
        int len = word.length();

        for (int k = 0; k < len; k++) {
            int[] freq = new int[26];

            for (int i = 0; i < len; i++)
                if (i != k) freq[word.charAt(i) - 'a']++;

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int f : freq) {
                if (f == 0) continue;

                if (f > max) max = f;
                if (f < min) min = f;
            }

            if (min == max) return true;
        }

        return false;
    }
}