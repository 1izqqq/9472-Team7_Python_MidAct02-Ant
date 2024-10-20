package kata.algorithms;

public class SudokuSolver {
    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == num) {
                return false;
            }
        }
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == num) {
                return false;
            }
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean findEmptyLocation(int[][] board, int[] location) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == 0) {
                    location[0] = r;
                    location[1] = c;
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean solveSudoku(int[][] board) {
        int[] location = new int[2];
        if (!findEmptyLocation(board, location)) {
            return true;
        }

        int row = location[0];
        int col = location[1];

        for (int num = 1; num <= 9; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;

                if (solveSudoku(board)) {
                    return true;
                }

                board[row][col] = 0;
            }
        }

        return false;
    }

    public static int[][] sudoku(int[][] puzzle) {
        if (solveSudoku(puzzle)) {
            return puzzle;
        } else {
            throw new IllegalArgumentException("No solution exists.");
        }
    }
}
