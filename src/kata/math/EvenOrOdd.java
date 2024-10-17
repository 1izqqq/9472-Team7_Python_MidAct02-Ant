package kata.math;

/**
 Create a function that takes an integer as an argument and returns “Even” for even number or “Odd” for odd numbers
 */
public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
