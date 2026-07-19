public class Main {
    public static void main(String[] args) {
        System.out.println(containsPattern(new int[] {1,2,4,4,4,4}, 1, 3));
        System.out.println(containsPattern(new int[] {1,2,1,2,1,1,1,3}, 2, 2));
        System.out.println(containsPattern(new int[] {1,2,1,2,1,3}, 2, 3));
    }

    public static boolean containsPattern(int[] arr, int m, int k) {
        int cnt = 0;
        int rep = (k - 1) * m;

        for (int i = m; i < arr.length; i++)
            if (arr[i] == arr[i - m]) {
                cnt++;
                if (cnt == rep) return true;
            } else
                cnt = 0;

        return false;
    }
}