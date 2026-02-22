public class Main {
    public static void main(String[] args) {
        System.out.println(checkDistances("abaccb", new int[] {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
        System.out.println(checkDistances("aa", new int[] {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
    }

    public static boolean checkDistances(String s, int[] distance) {
        int len = s.length() - 1;
        int idx;
        int idx2;

        for (int i = 0; i < len; i++) {
            idx = s.charAt(i) - 'a';
            if (distance[idx] == -1) continue;

            idx2 = i + distance[idx] + 1;
            if (idx2 > len || s.charAt(i) != s.charAt(idx2)) return false;

            distance[idx] = -1;
        }

        return true;
    }
}