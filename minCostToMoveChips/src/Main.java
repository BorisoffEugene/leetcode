public class Main {
    public static void main(String[] args) {
        System.out.println(minCostToMoveChips(new int[] {1,2,3}));
        System.out.println(minCostToMoveChips(new int[] {2,2,2,3,3}));
        System.out.println(minCostToMoveChips(new int[] {1,1000000000}));
    }

    public static int minCostToMoveChips(int[] position) {
        int[] cnt = new int[2];

        for (int p : position)
            cnt[p & 1]++;

        return Math.min(cnt[0], cnt[1]);
    }
}