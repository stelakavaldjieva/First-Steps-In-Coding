package exercise2;

import java.util.Scanner;

public class GodzillaVSKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        short extras = Short.parseShort(scanner.nextLine());
        double pricePerExtra = Double.parseDouble(scanner.nextLine());

        // Get price of the decor.
        double priceTotal = 0.1 * budget;

        // Add price per extras.
        if (extras > 150) {
            priceTotal += 0.9 * extras * pricePerExtra;
        } else {
            priceTotal += extras * pricePerExtra;
        }

        // Check whether the budget is enough.
        if (budget < priceTotal) {
            // If it is not enough, print message.
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", priceTotal - budget);
        } else {
            // If it is enough, print message.
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - priceTotal);
        }
    }
}
