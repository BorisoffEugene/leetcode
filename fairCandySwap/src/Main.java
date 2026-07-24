import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[] {1,1}, new int[] {2,2})));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        for (int val : aliceSizes)
            sumA += val;

        int sumB = 0;
        boolean[] existsB = new boolean[100_001];
        for (int val : bobSizes) {
            sumB += val;
            existsB[val] = true;
        }

        int delta = (sumB - sumA) / 2;
        int b;
        for (int a : aliceSizes) {
            b = a + delta;
            if (b >= 1 && b <= 100_000 && existsB[b]) return new int[] {a, b};
        }

        return new int[] {};
    }
}