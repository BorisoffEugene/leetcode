public class Main {
    public static void main(String[] args) {
        System.out.println(minNumberOfHours(5, 3, new int[] {1,4,3,2}, new int[] {2,6,3,1}));
        System.out.println(minNumberOfHours(2, 4, new int[] {1}, new int[] {3}));
    }

    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        // Energy
        int enrCnt = 1 - initialEnergy;
        for (int e : energy)
            enrCnt += e;

        enrCnt = Math.max(0, enrCnt);

        // Exp
        int[] arr = new int[experience.length];
        arr[0] = 0;
        int max = experience[0];
        int val;

        for (int i = 1; i < experience.length; i++) {
            arr[i] = arr[i - 1] + experience[i - 1];
            val = experience[i] - arr[i];
            if (max < val) max = val;
        }

        int expCnt = Math.max(0, max - initialExperience + 1);

        // Res
        return enrCnt + expCnt;
    }
}