
public class Main {
    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[] {2,3,2}, 2));
        System.out.println(timeRequiredToBuy(new int[] {5,1,1,1}, 0));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int res = 0;

        while (true) {
            for (int i = 0; i < tickets.length; i++)
                if (tickets[i] > 0) {
                    res++;
                    tickets[i]--;
                    if (tickets[k] == 0) return res;
                }
        }
    }
}