public class Main {
    public static void main(String[] args) {
        System.out.println(winningPlayerCount(4, new int[][]{{0,0},{1,0},{1,0},{2,1},{2,1},{2,0}}));
    }

    public static int winningPlayerCount(int n, int[][] pick) {
        int[][] arr = new int[n][11];
        int res = 0;

        for (int[] p : pick) {
            if (arr[p[0]][0] == -1) continue;

            arr[p[0]][p[1]]++;
            if (arr[p[0]][p[1]] == p[0] + 1) {
                res++;
                arr[p[0]][0] = -1;
            }
        }

        return res;
    }
}