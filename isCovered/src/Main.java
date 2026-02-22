public class Main {
    public static void main(String[] args) {
        System.out.println(isCovered(new int[][] {{1,2},{3,4},{5,6}}, 2, 5));
        System.out.println(isCovered(new int[][] {{1,10},{10,20}}, 21, 21));
    }

    public static boolean isCovered(int[][] ranges, int left, int right) {
        int cnt = right - left + 1;
        int[] arr = new int[51];
        int start;
        int end;

        for (int[] elm : ranges) {
            start = Math.max(left, elm[0]);
            end = Math.min(right, elm[1]);

            for (int i = start; i <= end; i++)
                if (arr[i] == 0) {
                    if (cnt == 1) return true;
                    arr[i] = 1;
                    cnt--;
                }
        }

        return false;
    }
}