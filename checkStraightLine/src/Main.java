public class Main {
    public static void main(String[] args) {
        System.out.println(checkStraightLine(new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
        System.out.println(checkStraightLine(new int[][] {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        for (int i = 0; i < coordinates.length - 2; i++)
            if (!collin(
                    coordinates[i][0], coordinates[i + 1][0], coordinates[i + 2][0],
                    coordinates[i][1], coordinates[i + 1][1], coordinates[i + 2][1]
               )) return false;

        return true;
    }

    public static boolean collin(int x1, int x2, int x3, int y1, int y2, int y3) {
        return (x3 - x2) * (y2 - y1) == (x2 - x1) * (y3 - y2);
    }
}