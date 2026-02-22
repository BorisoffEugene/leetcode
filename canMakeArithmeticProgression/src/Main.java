import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[] {3,5,1}));
        System.out.println(canMakeArithmeticProgression(new int[] {1,2,4}));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 2) return true;

        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i+=2)
            if (arr[i] - arr[i-1] != arr[i+1] - arr[i]) return false;

        return true;
    }
}