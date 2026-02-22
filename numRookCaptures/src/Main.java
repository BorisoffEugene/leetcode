public class Main {
    public static void main(String[] args) {
        System.out.println(numRookCaptures(new char[][] {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','R','.','.','.','p'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}}));
        System.out.println(numRookCaptures(new char[][] {{'.','.','.','.','.','.','.','.'},{'.','p','p','p','p','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','B','R','B','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','p','p','p','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}}));
        System.out.println(numRookCaptures(new char[][] {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'p','p','.','R','.','p','B','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}}));
    }

    public static int numRookCaptures(char[][] board) {
        int rI = -1;
        int rJ = -1;

        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if (board[i][j] == 'R') {
                    rI = i;
                    rJ = j;
                    break;
                }

        int res = 0;

        for (int j = rJ - 1; j >= 0; j--) {
            if (board[rI][j] == 'B') break;
            if (board[rI][j] == 'p') {res++; break;}
        }

        for (int j = rJ + 1; j < 8; j++) {
            if (board[rI][j] == 'B') break;
            if (board[rI][j] == 'p') {res++; break;}
        }

        for (int i = rI - 1; i >= 0; i--) {
            if (board[i][rJ] == 'B') break;
            if (board[i][rJ] == 'p') {res++; break;}
        }

        for (int i = rI + 1; i < 8; i++) {
            if (board[i][rJ] == 'B') break;
            if (board[i][rJ] == 'p') {res++; break;}
        }

        return res;
    }
}