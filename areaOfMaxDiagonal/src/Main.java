public class Main {
    public static void main(String[] args) {
        System.out.println(areaOfMaxDiagonal(new int[][] {{9,3},{8,6}}));
        System.out.println(areaOfMaxDiagonal(new int[][] {{3,4},{4,3}}));
    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDig = dimensions[0][0]*dimensions[0][0] + dimensions[0][1]*dimensions[0][1];
        int maxArea = dimensions[0][0] * dimensions[0][1];
        int curDig;
        int curArea;

        for (int i = 1; i < dimensions.length; i++) {
            curDig = dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1];
            curArea = dimensions[i][0] * dimensions[i][1];
            if (curDig > maxDig) {
                maxDig = curDig;
                maxArea = curArea;
            } else if (curDig == maxDig && curArea > maxArea) {
                maxArea = curArea;
            }
        }

        return maxArea;
    }
}