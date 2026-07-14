import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(numOfUnplacedFruits(new int[] {4,2,5}, new int[] {3,5,4}));
        System.out.println(numOfUnplacedFruits(new int[] {3,6,1}, new int[] {6,4,7}));
    }

    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int res = fruits.length;

        for (int fruit : fruits)
            for (int i = 0; i < baskets.length; i++)
                if (baskets[i] >= fruit) {
                    res--;
                    baskets[i] = 0;
                    break;
                }

        return res;
    }
}