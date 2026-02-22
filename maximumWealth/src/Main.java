public class Main {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] {{1,2,3},{3,2,1}}));
        System.out.println(maximumWealth(new int[][] {{1,5},{7,3},{3,5}}));
        System.out.println(maximumWealth(new int[][] {{2,8,7},{7,1,3},{1,9,5}}));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum;

        for (int[] pers : accounts) {
            sum = 0;
            for (int elm : pers) sum += elm;
            if (sum > max) max = sum;
        }

        return max;
    }
}