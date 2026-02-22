import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue = new LinkedList<>();
    private int cur;

    public RecentCounter() {

    }

    public int ping(int t) {
        queue.offer(t);

        while(true) {
            cur = queue.peek();
            if (cur >= t - 3000 && cur <= t) break;
            queue.poll();
        }

        return queue.size();
    }
}