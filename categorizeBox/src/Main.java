public class Main {
    public static void main(String[] args) {
        System.out.println(categorizeBox(1000, 35, 700, 300));
        System.out.println(categorizeBox(200, 50, 800, 50));
    }

    public static String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky = length >= 10_000 || width >= 10_000 || height >= 10_000;
        if (!isBulky) {
            long vol = (long) length * width * height;
            isBulky = vol > 1_000_000_000;
        }

        boolean isHeavy = mass >= 100;

        if (isBulky && isHeavy) return "Both";
        if (isBulky) return "Bulky";
        if (isHeavy) return "Heavy";
        return "Neither";
    }
}