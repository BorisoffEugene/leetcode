import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(tictactoe(new int[][] {{0,0},{2,0},{1,1},{2,1},{2,2}}));
        System.out.println(tictactoe(new int[][] {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}}));
        System.out.println(tictactoe(new int[][] {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}}));
        System.out.println(tictactoe(new int[][] {{2,2},{1,2},{2,1},{1,1},{2,0}}));
    }

    public static String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        int len = moves.length;
        if (len < 5) return "Pending";

        for (int i = 0; i < len; i+=2) {
            board[moves[i][0]][moves[i][1]] = 'A';
        }

        for (int i = 1; i < len; i+=2) {
            board[moves[i][0]][moves[i][1]] = 'B';
        }

        for (int i = 0; i < 3; i++)
            if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2]) return String.valueOf(board[i][0]);

        for (int i = 0; i < 3; i++)
            if (board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i]) return String.valueOf(board[0][i]);

        if (board[1][1] != 0 && board[0][0] == board[1][1] && board[1][1] == board[2][2]) return String.valueOf(board[1][1]);
        if (board[1][1] != 0 && board[0][2] == board[1][1] && board[1][1] == board[2][0]) return String.valueOf(board[1][1]);

        return (len == 9) ? "Draw" : "Pending";
    }
}