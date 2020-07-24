import java.util.Scanner;

/**
 * Common Math library functions.
 */
public class MathFunctions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();

        // Abs
        double abs = Math.abs(number);

        // Print abs = 'absolute value of abs'
        System.out.println("abs = " + abs);

        // Ceil
        double ceil = Math.ceil(number);

        // Print ceil = 'upper whole number'
        System.out.println("ceil = " + ceil);

        // Floor
        double floor = Math.floor(number);

        // Print floor = 'lower whole number'
        System.out.println("floor = " + floor);

        // Round
        long round = Math.round(number);

        // Print round = 'rounded number (from [number - 1].5 till [number].49999)'
        System.out.println("round = " + round);

        // Pow
        double pow = Math.pow(number, number);

        // Print pow = 'number multiplied 'number's' times'
        System.out.println("pow = " + pow);
    }
}
