package exercise3;

import java.util.Scanner;

public class Journey {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        //"summer" or "winter"
        String season = scanner.nextLine();

        String destination = "";

        double price = 0.0;

        String type = "";

        if (budget <= 100) {

            destination = "Bulgaria";

            if ("summer".equals(season)) {
                price = 0.3 * budget;
                type = "Camp";
            } else if ("winter".equals(season)) {
                price = 0.7 * budget;
                type = "Hotel";
            }

        } else if (budget <= 1000) {

            destination = "Balkans";

            if ("summer".equals(season)) {
                price = 0.4 * budget;
                type = "Camp";
            } else if ("winter".equals(season)) {
                price = 0.8 * budget;
                type = "Hotel";
            }

        } else {

            destination = "Europe";

            if ("summer".equals(season) || ("winter".equals(season))) {
                price = 0.9 * budget;
                type = "Hotel";
            }

        }

        System.out.printf("Somewhere in %s", destination);
        System.out.printf("%n%s - %.2f", type, price);
    }
}
