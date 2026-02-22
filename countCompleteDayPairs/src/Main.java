public class Main {
    public static void main(String[] args) {
        System.out.println(countCompleteDayPairs(new int[] {12,12,30,24,24}));
        System.out.println(countCompleteDayPairs(new int[] {72,48,24,3}));
    }

    public static int countCompleteDayPairs(int[] hours) {
        int res = 0;

        for (int i = 0; i < hours.length - 1; i++)
            for (int j = i + 1; j < hours.length; j++)
                if ((hours[i] + hours[j]) % 24 == 0) res++;

        return res;
    }
}