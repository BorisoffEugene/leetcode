import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(fillCups(new int[] {1,4,2}));
        System.out.println(fillCups(new int[] {5,4,4}));
        System.out.println(fillCups(new int[] {5,0,0}));
    }

    public static int fillCups(int[] amount) {
        Arrays.sort(amount);
        if (amount[1] == 0) return amount[2];

        int res = 0;
        do {
            amount[1]--;
            amount[2]--;
            res++;

            Arrays.sort(amount);
        } while (amount[1] > 0);

        return res + amount[2];
    }
}