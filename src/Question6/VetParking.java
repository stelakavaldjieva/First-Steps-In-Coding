package Question6;

import java.util.Scanner;

public class VetParking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int hours = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        int dayCounter = 0;

        for (int i = 1; i <= days; i++) {

            dayCounter++;

            double priceTotalDayI = 0;

            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0 && j % 2 != 0) {

                    priceTotalDayI += 2.5;

                } else if (i % 2 != 0 && j % 2 == 0) {

                    priceTotalDayI += 1.25;

                } else {

                    priceTotalDayI++;
                }
            }
            totalSum += priceTotalDayI;

            System.out.printf("Day: %d - %.2f leva%n", dayCounter, priceTotalDayI);
        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}
