public class Main {
    public static void main(String[] args) {
        System.out.println(canBeEqual(new int[] {1,2,3,4}, new int[] {2,4,1,3}));
        System.out.println(canBeEqual(new int[] {7}, new int[] {7}));
        System.out.println(canBeEqual(new int[] {3,7,9}, new int[] {3,7,11}));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        int[] freq = new int[1001];

        for (int i = 0; i < target.length; i++) {
            freq[target[i]]++;
            freq[arr[i]]--;
        }

        for (int i = 1; i < 1001; i++)
            if (freq[i] != 0) return false;

        return true;
    }
}