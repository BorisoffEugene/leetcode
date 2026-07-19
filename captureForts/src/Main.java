public class Main {
    public static void main(String[] args) {
        System.out.println(captureForts(new int[] {1,0,0,-1,0,0,0,0,1}));
        System.out.println(captureForts(new int[] {0,0,1,-1}));
        System.out.println(captureForts(new int[] {-1,-1,0,1,0,0,1,-1,1,0}));
    }

    public static int captureForts(int[] forts) {
        int i = 0;
        while (i < forts.length && forts[i] == 0) i++;
        if (i == forts.length) return 0;

        int start = i;
        i++;
        int max = 0;

        while (i < forts.length) {
            if (forts[i] != 0) {
                if (forts[i] != forts[start])
                    max = Math.max(i - start - 1, max);
                start = i;
            }

            i++;
        }

        return max;
    }
}