package exercise3;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        short quantity = Short.parseShort(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double price = 0.0;

        if ("Roses".equals(flower)) {
            if (quantity > 80) {
                price = quantity * 5 * 0.9;
            } else {
                price = quantity * 5;
            }
        } else if ("Dahlias".equals(flower)) {
            if (quantity > 90) {
                price = quantity * 3.80 * 0.85;
            } else {
                price = quantity * 3.80;
            }
        } else if ("Tulips".equals(flower)) {
            if (quantity > 80) {
                price = quantity * 2.80 * 0.85;
            } else {
                price = quantity * 2.80;
            }
        } else if ("Narcissus".equals(flower)) {
            if (quantity < 120) {
                price = quantity * 3 * 1.15;
            } else {
                price = quantity * 3;
            }
        } else if ("Gladiolus".equals(flower)) {
            if (quantity < 80) {
                price = quantity * 2.50 * 1.2;
            } else {
                price = quantity * 2.50;
            }
        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %s %s and %.2f leva left.", quantity, flower, budget - price);
        } else if (budget < price) {
            System.out.printf(" Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
