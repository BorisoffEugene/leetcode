public class Main {
    public static void main(String[] args) {
        System.out.println(distanceBetweenBusStops(new int[] {1,2,3,4}, 0, 1));
        System.out.println(distanceBetweenBusStops(new int[] {1,2,3,4}, 0, 2));
        System.out.println(distanceBetweenBusStops(new int[] {1,2,3,4}, 0, 3));
    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start == destination) return 0;

        int i = 0;
        int len = distance.length;
        int dist1 = 0;
        int dist2 = 0;
        int idxCW;
        int idxCCW;
        boolean destCW = false;
        boolean destCCW = false;

        while (!destCW || !destCCW) {
            if (!destCW) {
                idxCW = normIdx(start + i, len);

                if (idxCW == destination)
                    destCW = true;
                else
                    dist1 += distance[idxCW];

                if (destCCW && dist1 >= dist2) destCW = true;
            }

            if (!destCCW) {
                idxCCW = normIdx(start - i - 1, len);
                dist2 += distance[idxCCW];

                if (idxCCW == destination) destCCW = true;
                if (destCW && dist2 >= dist1) destCCW = true;
            }

            i++;
        }

        return Math.min(dist1, dist2);
    }

    public static int normIdx(int idx, int len) {
        if (idx < 0) return len + idx;
        if (idx >= len) return idx - len;
        return idx;
    }
}