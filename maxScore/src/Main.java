public class Main {
    public static void main(String[] args) {
        System.out.println(maxScore("1110011010111001001010101011010110100000010100001111001000001101000"));

    }

    public static int maxScore(String s) {
        char[] arr = s.toCharArray();
        int sum = myBitCount(arr);
        if (sum == arr.length) return arr.length - 1;
        if (sum == 0) return arr.length - 1;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '0')
                sum++;
            else
                sum--;

            if (maxSum < sum)
                maxSum = sum;
        }

        return maxSum;
    }

    public static int myBitCount(char[] arr) {
        int res = 0;
        for (char c : arr)
            if (c == '1') res++;

        return res;
    }
}