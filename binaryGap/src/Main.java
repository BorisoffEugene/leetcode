public class Main {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
        System.out.println(binaryGap(8));
        System.out.println(binaryGap(5));
    }

    public static int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        int start = -1;
        int len = str.length();
        int max = 0;
        int dist;

        for (int i = 0; i < len; i++)
            if (str.charAt(i) == '1') {
                if (start == -1)
                    start = i;
                else {
                    dist = i - start;
                    start = i;
                    if (dist > max) max = dist;
                }
            }

        return max;
    }
}