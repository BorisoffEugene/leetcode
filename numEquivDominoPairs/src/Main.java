import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(numEquivDominoPairs(new int[][] {{1,2},{2,1},{3,4},{5,6}}));
        System.out.println(numEquivDominoPairs(new int[][] {{1,2},{1,2},{1,1},{1,2},{2,2}}));
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int val1;
        int val2;
        int cnt = 0;
        int tmpCnt;

        for (int i = 0; i < dominoes.length; i++) {
            val1 = dominoes[i][0] * 10 + dominoes[i][1];
            val2 = dominoes[i][1] * 10 + dominoes[i][0];

            if (map.containsKey(val1)) {
                tmpCnt = map.get(val1);
                map.put(val1, tmpCnt + 1);
                cnt += tmpCnt;
            } else if (map.containsKey(val2)) {
                tmpCnt = map.get(val2);
                map.put(val2, tmpCnt + 1);
                cnt += tmpCnt;
            }else
                map.put(val1, 1);
        }

        return cnt;
    }
}