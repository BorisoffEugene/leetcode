public class Main {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[] {2,1}));
        System.out.println(validMountainArray(new int[] {3,5,5}));
        System.out.println(validMountainArray(new int[] {0,3,2,1}));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        if (arr[1] <= arr[0]) return false;

        int sign = 1;
        int curSign;

        for (int i = 2; i < arr.length; i++) {
            curSign = Integer.signum(arr[i] - arr[i - 1]);
            if (curSign == 0) return false;
            if (sign == -1 && curSign == 1) return false;
            if (sign == 1 && curSign == -1) sign = -1;
        }

        return sign == -1;
    }
}