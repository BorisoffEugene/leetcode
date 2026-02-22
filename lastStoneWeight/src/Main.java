import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[] {2,7,4,1,8,1}));
        System.out.println(lastStoneWeight(new int[] {1}));
    }

    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones)
            queue.add(stone);

        int stone1;
        int stone2;
        while (queue.size() > 1) {
            stone1 = queue.poll();
            stone2 = queue.poll();

            if (stone1 > stone2) queue.add(stone1 - stone2);
        }

        if (queue.size() == 1) return queue.peek();
        return 0;
    }
}