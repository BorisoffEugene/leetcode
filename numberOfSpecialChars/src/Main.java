public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfSpecialChars("aaAbcBC"));
        System.out.println(numberOfSpecialChars("abc"));
        System.out.println(numberOfSpecialChars("abBCab"));
    }

    public static int numberOfSpecialChars(String word) {
        int res = 0;
        int[] arr = new int[26];
        int idx;
        int val;

        for (char c : word.toCharArray()) {
            if (c <= 90) {
                idx = c - 65;
                val = 10;
            } else {
                idx = c - 97;
                val = 1;
            }

            if (arr[idx] == 0)
                arr[idx] = val;
            else if (arr[idx] != 11 && arr[idx] != val) {
                arr[idx] = 11;
                res++;
            }
        }

        return res;
    }
}