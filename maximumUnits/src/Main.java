public class Main {
    public static void main(String[] args) {
        System.out.println(maximumUnits(new int[][] {{1,3},{2,2},{3,1}}, 4));
        System.out.println(maximumUnits(new int[][] {{5,10},{2,5},{4,7},{3,9}}, 10));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int max = 0;
        int[] units = new int[1001];
        for (int[] elm : boxTypes) {
            units[elm[1]] += elm[0];
            if (max < elm[1]) max = elm[1];
        }

        int res = 0;
        int cnt;
        for (int i = max; i > 0; i--)
            if (units[i] > 0) {
                cnt = Math.min(truckSize, units[i]);
                res = res + cnt * i;
                truckSize -= cnt;
                if (truckSize == 0) break;
            }

        return res;
    }
}