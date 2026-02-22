public class Main {
    public static void main(String[] args) {
        System.out.println(findClosest(2, 7, 4));
        System.out.println(findClosest(2, 5, 6));
        System.out.println(findClosest(1, 5, 3));
    }

    public static int findClosest(int x, int y, int z) {
        int distX = Math.abs(z - x);
        int distY = Math.abs(z - y);

        if (distX < distY) return 1;
        if (distX > distY) return 2;
        return 0;
    }
}