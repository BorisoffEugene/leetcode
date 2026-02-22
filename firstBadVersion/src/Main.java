public class Main {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }

    public static int firstBadVersion(int n) {
        if (n == 1) return 1;

        int first = 1;
        int last = n;
        int res = first + (last - first) / 2;

        while ((last - first) > 1) {
            if (isBadVersion(res))
                last = res;
            else
                first = res;

            res = first + (last - first) / 2;
        }

        return isBadVersion(first) ? first : first + 1;
    }

    public static boolean isBadVersion(int version) {
        int bad = 10;
        return version >= bad;
    }
}