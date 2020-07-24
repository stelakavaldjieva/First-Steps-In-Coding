package lecture6;

import java.util.Scanner;

public class Travelling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Country or command: "End"
        String input = scanner.nextLine();

        while (!"End".equals(input)) {

            double budget = 0;

            double minimalBudget = Double.parseDouble(scanner.nextLine());

            while (budget < minimalBudget) {

                double currentBudget = Double.parseDouble(scanner.nextLine());

                budget += currentBudget;
            }

            System.out.printf("Going to %s!%n", input);

            input = scanner.nextLine();
        }
    }
}
