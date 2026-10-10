package DSA_50.RecursionBacktracking;

public class WordSearch_36 {

    static boolean search(char[][] board, String word,
                          int row, int col, int index) {

        if (index == word.length())
            return true;

        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length ||
            board[row][col] != word.charAt(index)) {

            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found =
            search(board, word, row + 1, col, index + 1) ||
            search(board, word, row - 1, col, index + 1) ||
            search(board, word, row, col + 1, index + 1) ||
            search(board, word, row, col - 1, index + 1);

        board[row][col] = temp;

        return found;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word = "ABCCED";

        boolean found = false;

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if (search(board, word, i, j, 0)) {
                    found = true;
                }
            }
        }

        System.out.println(found);
    }
}
