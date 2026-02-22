public class Main {
    public static void main(String[] args) {
        System.out.println(maximumPopulation(new int[][] {{1950,1961},{1960,1971},{1970,1981}}));
        System.out.println(maximumPopulation(new int[][] {{2033,2034},{2039,2047},{1998,2042},{2047,2048},{2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014}}));
    }

    public static int maximumPopulation(int[][] logs) {
        int max = 0;
        int res = 2051;
        int[] arr = new int[101];

        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j - 1950]++;
                if (arr[j - 1950] > max) {
                    max = arr[j - 1950];
                    res = j;
                } else if (arr[j - 1950] == max) {
                    res = Math.min(res, j);
                }
            }
        }

        return res;
    }
}