import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println(pickGifts(new int[] {25,64,9,4,100}, 4));
        System.out.println(pickGifts(new int[] {1,1,1,1}, 4));
        System.out.println(pickGifts(new int[] {56,41,27,71,62,57,67,34,8,71,2,12,52,1,64,43,32,42,9,25,73,29,31}, 52));
    }

    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int gift : gifts)
            pq.add(gift);

        int val;
        for (int i = 0; i < k; i++) {
            val = pq.poll();
            val = (int) Math.sqrt(val);
            pq.add(val);
            //if (val == 1) break;
        }

        long res = 0L;
        for (int elm : pq)
            res += elm;

        return res;
    }
}