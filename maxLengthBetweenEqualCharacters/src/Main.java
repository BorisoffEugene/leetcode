public class Main {
    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("aa"));
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
        System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        int len = s.length();
        if (len == 1) return -1;

        int[] arr = new int[26];
        int idx;
        int max = 0;
        int tmp;

        for (int i = 0; i < len; i++) {
            idx = s.charAt(i) - 'a';
            if (arr[idx] == 0)
                arr[idx] = i + 1;
            else {
                tmp = i + 1 - arr[idx];
                if (tmp > max) max = tmp;
            }
        }

        return max - 1;
    }
}