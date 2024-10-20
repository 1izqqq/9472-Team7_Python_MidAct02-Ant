package kata;

import kata.algorithms.RomanNumeralsEncoder;
import kata.algorithms.SudokuSolver;

public class Algorithms {
    public static void main(String[] args) {
        RomanNumeralsEncoder encoder = new RomanNumeralsEncoder();
        int numberToEncode = 1994;
        String romanNumeral = encoder.solution(numberToEncode);
        System.out.println("Integer: " + numberToEncode + " => Roman Numeral: " + romanNumeral);

        int[][] sudokuPuzzle = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 6, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 2, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 8, 0, 0, 0, 7, 9}
        };

        System.out.println("Sudoku Puzzle Before Solving:");
        printBoard(sudokuPuzzle);

        try {
            int[][] solvedPuzzle = SudokuSolver.sudoku(sudokuPuzzle);
            System.out.println("Sudoku Puzzle After Solving:");
            printBoard(solvedPuzzle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Helper method to print the Sudoku board
    private static void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}