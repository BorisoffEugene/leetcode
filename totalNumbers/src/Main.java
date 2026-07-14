public class Main {
    public static void main(String[] args) {
        System.out.println(totalNumbers(new int[]{1,2,3,4}));
        System.out.println(totalNumbers(new int[]{0,2,2}));
        System.out.println(totalNumbers(new int[]{6,6,6}));
        System.out.println(totalNumbers(new int[]{1,3,5}));
    }

    public static int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;

        int cnt = 0;

        for (int d100 = 1; d100 < 10; d100++)
            for (int d10 = 0; d10 < 10; d10++)
                for (int d1 = 0; d1 < 9; d1 += 2) {
                    freq[d100]--;
                    freq[d10]--;
                    freq[d1]--;

                    if (freq[d100] >= 0 && freq[d10] >= 0 && freq[d1] >= 0) cnt++;

                    freq[d100]++;
                    freq[d10]++;
                    freq[d1]++;
                }

        return cnt;
    }
}