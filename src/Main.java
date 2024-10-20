import kata.algorithms.RomanNumeralsEncoder;
import kata.algorithms.SudokuSolver;
import kata.arrays.FindTheStrayNumber;
import kata.conditions.GoodVsEvil;
import kata.conditions.GrassHopper;
import kata.arrays.HighestProfit;
import kata.math.Dinglemouse;
import kata.math.EvenOrOdd;
import kata.math.MultiplesOf3Or5;
import kata.math.VowelCount;
import kata.strings.ConvertStringtoCamelCase;
import kata.strings.PigLatin;
import kata.strings.WhoLikesIt;
import kata.strings.YourOrderPlease;

import java.util.Arrays;

/**
 This class compiles all the codes in each package!
 */
public class Main {
    public static void main(String[] args) {
        // RomanNumeralsEncoder
        RomanNumeralsEncoder romanEncoder = new RomanNumeralsEncoder();
        int number = 1994;
        String romanNumerals = romanEncoder.solution(number);
        System.out.println("Roman Numerals for " + number + ": " + romanNumerals);

        // SudokoSolver
        int[][] sudokuPuzzle = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        int[][] solvedSudoku = SudokuSolver.sudoku(sudokuPuzzle);
        System.out.println("Solved Sudoku Puzzle:");
        for (int[] row : solvedSudoku) {
            System.out.println(Arrays.toString(row));
        }

        // GoodVsEvil
        String goodAmounts = "0 0 1 0 0 1"; // Example counts for Good
        String evilAmounts = "0 0 1 0 0 1 1"; // Example counts for Evil
        String battleResult = GoodVsEvil.battle(goodAmounts, evilAmounts);
        System.out.println(battleResult);

        // GrassHopper
        int s1 = 85, s2 = 90, s3 = 78; // Example scores
        char grade = GrassHopper.getGrade(s1, s2, s3);
        System.out.println("Grade: " + grade);

        // FindTheStrayNumber
        int[] strayNumbers = {1, 1, 2}; // Example array
        int strayNumber = FindTheStrayNumber.stray(strayNumbers);
        System.out.println("Stray Number: " + strayNumber);

        // HighestProfit
        int[] profits = {7, 1, 5, 3, 6, 4}; // Example profit array
        int[] minMax = HighestProfit.minMax(profits);
        System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);

        // Dinglemouse
        int humanYears = 5; // Example human years
        int[] catDogYears = Dinglemouse.humanYearsCatYearsDogYears(humanYears);
        System.out.println("Human Years: " + humanYears + ", Cat Years: " + catDogYears[1] + ", Dog Years: " + catDogYears[2]);

        // EvenOrOdd
        int numberToCheck = 7; // Example number
        String evenOrOddResult = EvenOrOdd.evenOrOdd(numberToCheck);
        System.out.println("Number " + numberToCheck + " is " + evenOrOddResult);

        // MultiplesOf3Or5
        int limit = 10; // Example limit
        int multiplesSum = MultiplesOf3Or5.solution(limit);
        System.out.println("Sum of multiples of 3 or 5 below " + limit + ": " + multiplesSum);

        // VowelCount
        String inputString = "Hello Team 7"; // Example string
        int vowelCount = VowelCount.getCount(inputString);
        System.out.println("Number of vowels in \"" + inputString + "\": " + vowelCount);

        // ConvertStringtoCamelCase
        String input = "the_stealth_warrior";
        String camelCaseOutput = ConvertStringtoCamelCase.toCamelCase(input);
        System.out.println("Camel Case: " + camelCaseOutput);

        // PigLatin
        String pigLatinInput = "Hello world !";
        String pigLatinOutput = PigLatin.pigIt(pigLatinInput);
        System.out.println("Pig Latin: " + pigLatinOutput);

        // WhoLikesIt
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        String likesOutput = WhoLikesIt.whoLikesIt(names);
        System.out.println(likesOutput);

        // YourOrderPlease
        String words = "is2 Thi1s T4est 3a";
        String orderedOutput = YourOrderPlease.order(words);
        System.out.println("Ordered: " + orderedOutput);
    } // end of main method
} // end of class
