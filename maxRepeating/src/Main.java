public class Main {
    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc", "ab"));
        System.out.println(maxRepeating("ababc", "ba"));
        System.out.println(maxRepeating("ababc", "ac"));
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba")) ;
    }

    public static int maxRepeating(String sequence, String word) {
        int maxCnt = sequence.length() / word.length();
        int res = 0;

        for (int i = 1; i <= maxCnt; i++) {
            if (sequence.indexOf(word.repeat(i)) == -1) break;

            res++;
        }

        return res;
    }
}