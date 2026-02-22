public class Main {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[] {-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[] {-4,-3,-2,-1,4,3,2}));
    }

    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int maxSum = 0;

        for (int g : gain) {
            sum += g;
            if (maxSum < sum) maxSum = sum;
        }

        return maxSum;
    }
}