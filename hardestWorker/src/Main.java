public class Main {
    public static void main(String[] args) {
        System.out.println(hardestWorker(10, new int[][] {{0,3},{2,5},{0,9},{1,15}}));
        System.out.println(hardestWorker(26, new int[][] {{1,1},{3,7},{2,12},{7,17}}));
        System.out.println(hardestWorker(2, new int[][] {{0,10},{1,20}}));
    }

    public static int hardestWorker(int n, int[][] logs) {
        int max = logs[0][1];
        int id = logs[0][0];
        int val;

        for (int i = 1; i < logs.length; i++) {
            val = logs[i][1] - logs[i - 1][1];
            if (max < val) {
                max = val;
                id = logs[i][0];
            } else if (max == val && id > logs[i][0])
                id = logs[i][0];

        }

        return id;
    }
}