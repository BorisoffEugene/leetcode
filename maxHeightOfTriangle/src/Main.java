public class Main {
    public static void main(String[] args) {
        System.out.println(maxHeightOfTriangle(2, 4));
        System.out.println(maxHeightOfTriangle(2, 1));
        System.out.println(maxHeightOfTriangle(1, 1));
        System.out.println(maxHeightOfTriangle(10, 1));
    }

    public static int maxHeightOfTriangle(int red, int blue) {
        return Math.max(getHeight(red, blue), getHeight(blue, red));
    }

    public static int getHeight(int c1, int c2) {
        int hOdd = 2 * (int)Math.sqrt(c1) - 1;
        int hEven = (int)Math.sqrt(4 * c2 + 1) - 1;

        if (Math.abs(hOdd - hEven) >= 1) return Math.min(hOdd, hEven) + 1;
        return Math.min(hOdd, hEven);
    }
}