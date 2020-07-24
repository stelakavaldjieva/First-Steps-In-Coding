package exercise3;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String season = scanner.nextLine();

        byte fishers = Byte.parseByte(scanner.nextLine());

        double price = 0.0;

        if ("Spring".equals(season)) {
            price = 3000;

            if (fishers <= 6)
                price *= 0.9;
            else if (fishers <= 11)
                price *= 0.85;
            else
                price *= 0.75;

        } else if ("Summer".equals(season) || ("Autumn".equals(season))) {
            price = 4200;

            if (fishers <= 6)
                price *= 0.9;
            else if (fishers <= 11)
                price *= 0.85;
            else
                price *= 0.75;

        } else if ("Winter".equals(season)) {
            price = 2600;

            if (fishers <= 6)
                price *= 0.9;
            else if (fishers <= 11)
                price *= 0.85;
            else
                price *= 0.75;

        }

        if (fishers % 2 == 0 && !"Autumn".equals(season))
            price *= 0.95;

        if (budget >= price)
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        else
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);

    }
}
