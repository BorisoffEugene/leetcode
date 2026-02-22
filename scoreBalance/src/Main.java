public class Main {
    private static int leftIdx;
    private static int rightIdx;
    private static int[] leftSum;
    private static int[] rightSum;
    private static char[] arr;

    public static void main(String[] args) {
        System.out.println(scoreBalance("adcb"));
        System.out.println(scoreBalance("bace"));
    }

    public static boolean scoreBalance(String s) {
        arr = s.toCharArray();
        leftSum = new int[arr.length];
        rightSum = new int[arr.length];
        leftSum[0] = arr[0] - 96;
        leftIdx = 0;
        rightSum[rightSum.length - 1] = arr[arr.length - 1] - 96;
        rightIdx = rightSum.length - 1;

        for (int i = 1; i < arr.length; i++)
            if (leftSumByIdx(i - 1) == rightSumByIdx(i)) return true;

        return false;
    }

    public static int leftSumByIdx(int idx) {
        if (leftSum[idx] > 0) return leftSum[idx];

        for (int i = leftIdx + 1; i <= idx; i++)
            leftSum[i] = leftSum[i - 1] + arr[i] - 96;

        leftIdx = idx;
        return leftSum[idx];
    }

    public static int rightSumByIdx(int idx) {
        if (rightSum[idx] > 0) return rightSum[idx];

        for (int i = rightIdx - 1; i >= idx; i--)
            rightSum[i] = rightSum[i + 1] + arr[i] - 96;

        rightIdx = idx;
        return rightSum[idx];
    }


}