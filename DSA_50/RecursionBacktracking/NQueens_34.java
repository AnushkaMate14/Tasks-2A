package DSA_50.RecursionBacktracking;
public class NQueens_34 {

    static int n = 4;

    static boolean isSafe(char[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n; i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    static boolean solve(char[][] board, int row) {

        if (row == n)
            return true;

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                if (solve(board, row + 1))
                    return true;

                board[row][col] = '.';
            }
        }

        return false;
    }

    public static void main(String[] args) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0);

        for (char[] row : board) {
            System.out.println(row);
        }
    }
}
