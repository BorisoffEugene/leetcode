public class Main {
    public static void main(String[] args) {
        System.out.println(isWinner(new int[] {5,10,3,2}, new int[] {6,5,7,3}));
    }

    public static int isWinner(int[] player1, int[] player2) {
        int sum1 = player1[0];
        int sum2 = player2[0];

        if (player1.length > 1) {
            sum1 = sum1 + player1[1] + (player1[0] == 10 ? player1[1] : 0);
            sum2 = sum2 + player2[1] + (player2[0] == 10 ? player2[1] : 0);
        }

        for (int i = 2; i < player1.length; i++) {
            sum1 = sum1 + player1[i] + (player1[i - 1] == 10 ? player1[i] : player1[i - 2] == 10 ? player1[i] : 0);
            sum2 = sum2 + player2[i] + (player2[i - 1] == 10 ? player2[i] : player2[i - 2] == 10 ? player2[i] : 0);
        }

        if (sum1 > sum2) return 1;
        if (sum1 < sum2) return 2;
        return 0;
    }
}