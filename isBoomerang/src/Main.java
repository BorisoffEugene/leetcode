public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,1},{1,1},{3,3}};
        System.out.println(isBoomerang(arr));

    }

    public static boolean isBoomerang(int[][] points) {
        return (points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) != (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]);
    }


}