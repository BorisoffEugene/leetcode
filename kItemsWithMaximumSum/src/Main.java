public class Main {
    public static void main(String[] args) {
        System.out.println(kItemsWithMaximumSum(3, 2, 0, 2));
        System.out.println(kItemsWithMaximumSum(3, 2, 0, 4));
    }

    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int res = Math.min(numOnes, k);
        if (numOnes + numZeros >= k) return res;

        res = res - (k - numOnes - numZeros);
        return res;
    }
}