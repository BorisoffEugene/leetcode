public class Main {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0,1,0}, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;

        for (int i = 0; i < flowerbed.length; i++) {
            System.out.println(i);
            if (checkPlace(flowerbed, i)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) return true;
                i++;
            }
        }

        return false;
    }

    public static boolean checkPlace(int[] flowerbed, int pos) {
        if (flowerbed[pos] == 1) return false;

        if (pos - 1 == -1 && pos + 1 == flowerbed.length) return true;
        if (pos - 1 == -1 && flowerbed[pos + 1] == 0) return true;
        if (pos - 1 == -1 && flowerbed[pos + 1] == 1) return false;
        if (flowerbed[pos - 1] == 0 && pos + 1 == flowerbed.length) return true;
        if (flowerbed[pos - 1] == 1 && pos + 1 == flowerbed.length) return false;

        if (flowerbed[pos - 1] == 0 && flowerbed[pos + 1] == 0) return true;

        return false;
    }
}