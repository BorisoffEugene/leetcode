public class Main {
    public static void main(String[] args) {
        System.out.println(maxDistance(new int[] {1,1,1,6,1,1,1}));
        System.out.println(maxDistance(new int[] {1,8,3,8,3}));
        System.out.println(maxDistance(new int[] {0,1}));
    }

    public static int maxDistance(int[] colors) {
        int len = colors.length - 1;
        int col = colors[0];

        if (col != colors[len]) return len;

        for (int i = 1; i < len; i++)
            if (colors[i] != col || colors[len - i] != col)
                return Math.max(i, len - i);

        return -1;
    }
}