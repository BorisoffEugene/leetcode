public class Main {
    public static void main(String[] args) {
        System.out.println(findJudge(2, new int[][] {{1,2}}));
        System.out.println(findJudge(3, new int[][] {{1,3},{2,3}}));
        System.out.println(findJudge(3, new int[][] {{1,3},{2,3},{3,1}}));
        System.out.println(findJudge(3, new int[][] {{1,2},{2,3}}));
    }

    public static int findJudge(int n, int[][] trust) {
        boolean[] notJudge = new boolean[n + 1];
        int[] cntJudge = new int[n + 1];

        for (int[] elm : trust) {
            notJudge[elm[0]] = true;
            cntJudge[elm[1]]++;
        }

        for (int i = 1; i <= n; i++)
            if (!notJudge[i] && cntJudge[i] == n - 1) return i;

        return -1;
    }
}