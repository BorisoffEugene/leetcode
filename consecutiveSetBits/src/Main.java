public class Main {
    public static void main(String[] args) {
        System.out.println(consecutiveSetBits(6));
        System.out.println(consecutiveSetBits(5));
    }

    public static boolean consecutiveSetBits(int n) {
        String s = Integer.toBinaryString(n);

        int pos = s.indexOf("11");
        if (pos == -1) return false;

        pos = s.indexOf("11", pos + 1);
        return pos == -1;
    }
}