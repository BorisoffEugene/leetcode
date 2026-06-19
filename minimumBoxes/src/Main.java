import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumBoxes(new int[] {1,3,2}, new int[] {4,3,1,5,2}));
        System.out.println(minimumBoxes(new int[] {5,5,5}, new int[] {2,4,2,7}));
    }

    public static int minimumBoxes(int[] apple, int[] capacity) {
        int appleCnt = 0;
        for (int a : apple)
            appleCnt += a;

        Arrays.sort(capacity);

        int capSum = 0;
        int res = 0;

        for (int i = capacity.length - 1; i >= 0; i--) {
            capSum += capacity[i];
            res++;
            if (capSum >= appleCnt) break;
        }

        return res;
    }
}