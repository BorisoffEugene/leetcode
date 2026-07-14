public class Main {
    public static void main(String[] args) {
        System.out.println(minChanges(13, 4));
        System.out.println(minChanges(14, 13));
        System.out.println(minChanges(2, 47));
    }

    public static int minChanges(int n, int k) {
        if (n == k) return 0;

        int cntN = Integer.bitCount(n);
        int cntK = Integer.bitCount(k);
        int cntX = Integer.bitCount(n ^ k);

        if ((cntN - cntK) == cntX) return cntX;
        return -1;
    }
}