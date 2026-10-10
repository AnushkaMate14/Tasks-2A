package DSA_50.RecursionBacktracking;

public class RatMaze_33 {

    static int n;

    static boolean solve(int[][] maze, int x, int y, int[][] solution) {

        if (x == n - 1 && y == n - 1) {
            solution[x][y] = 1;
            return true;
        }

        if (x >= 0 && x < n &&
            y >= 0 && y < n &&
            maze[x][y] == 1) {

            solution[x][y] = 1;

            if (solve(maze, x + 1, y, solution))
                return true;

            if (solve(maze, x, y + 1, solution))
                return true;

            solution[x][y] = 0;
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        n = maze.length;

        int[][] solution = new int[n][n];

        solve(maze, 0, 0, solution);

        for (int[] row : solution) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
