import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(recoverOrder(new int[] {3,1,2,5,4}, new int[] {1,3,4})));
        System.out.println(Arrays.toString(recoverOrder(new int[] {1,4,5,3,2}, new int[] {2,5})));
    }

    public static int[] recoverOrder(int[] order, int[] friends) {
        int idx = 0;
        int[] res = new int[friends.length];
        boolean[] check = new boolean[order.length + 1];

        for (int elm : friends)
            check[elm] = true;

        for (int elm : order)
            if (check[elm]) res[idx++] = elm;

        return res;
    }
}