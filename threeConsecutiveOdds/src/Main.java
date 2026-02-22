public class Main {
    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[] {2,6,4,1}));
        System.out.println(threeConsecutiveOdds(new int[] {1,2,34,3,4,5,7,23,12}));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 2; i++)
            if ((arr[i] & 1) == 1) {
                if ((arr[i + 1] & 1) == 1) {
                    if ((arr[i + 2] & 1) == 1) {
                        return true;
                    } else {
                        i += 2;
                    }
                } else {
                    i++;
                }
            }

        return false;
    }
}