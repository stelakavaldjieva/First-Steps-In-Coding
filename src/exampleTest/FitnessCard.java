package exampleTest;

import java.util.Scanner;

public class FitnessCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Float.parseFloat(scanner.nextLine());

        String gender = scanner.nextLine();

        byte age = Byte.parseByte(scanner.nextLine());

        String sport = scanner.nextLine();

        double totalMoney = 0;

        if ("Gym".equals(sport)) {

            if ("m".equals(gender)) {

                totalMoney = 42;

            } else if ("f".equals(gender)) {

                totalMoney = 35;
            }

        } else if ("Boxing".equals(sport)) {

            if ("m".equals(gender)) {

                totalMoney = 41;

            } else if ("f".equals(gender)) {

                totalMoney = 37;
            }

        } else if ("Yoga".equals(sport)) {

            if ("m".equals(gender)) {

                totalMoney = 45;

            } else if ("f".equals(gender)) {

                totalMoney = 42;
            }

        } else if ("Zumba".equals(sport)) {

            if ("m".equals(gender)) {

                totalMoney = 34;

            } else if ("f".equals(gender)) {

                totalMoney = 31;
            }

        } else if ("Dances".equals(sport)) {

            if ("m".equals(gender)) {

                totalMoney = 51;

            } else if ("f".equals(gender)) {

                totalMoney = 53;
            }

        } else if ("Pilates".equals(sport)) {

            if ("m".equals(gender)) {

                totalMoney = 39;

            } else if ("f".equals(gender)) {

                totalMoney = 37;
            }
        }

        if (age <= 19) {

            totalMoney *= 0.8;
        }

        if (budget >= totalMoney) {

            System.out.printf("You purchased a 1 month pass for %s.", sport);

        } else {

            System.out.printf("You don't have enough money! You need $%.2f more.", totalMoney - budget);
        }
    }
}
