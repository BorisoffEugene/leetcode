public class Main {
    public static void main(String[] args) {
        System.out.println(buttonWithLongestTime(new int[][] {{1,2},{2,5},{3,9},{1,15}}));
        System.out.println(buttonWithLongestTime(new int[][] {{10,5},{1,7}}));
        System.out.println(buttonWithLongestTime(new int[][] {{5,3},{5,4},{16,5},{11,8},{15,9},{8,11},{10,12},{1,15}}));
    }

    public static int buttonWithLongestTime(int[][] events) {
        int max = events[0][1];
        int idx = events[0][0];
        int tmp;

        for (int i = 1; i < events.length; i++) {
            tmp = events[i][1] - events[i - 1][1];
            if (tmp > max) {
                max = tmp;
                idx = events[i][0];
            } else if (tmp == max && idx > events[i][0])
                idx = events[i][0];
        }

        return idx;
    }
}