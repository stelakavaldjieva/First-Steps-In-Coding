package exampleTest2;

import java.util.Scanner;

public class EasterDecoration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceTotal = 0;

        int costumers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= costumers; i++) {

            double sumPerCostumer = 0;

            int counterItems = 0;

            String item = scanner.nextLine();

            while (!"Finish".equals(item)) {

                counterItems++;

                switch (item) {

                    case "basket":

                        sumPerCostumer += 1.50;

                        break;

                    case "wreath":

                        sumPerCostumer += 3.80;

                        break;

                    case "chocolate bunny":

                        sumPerCostumer += 7;

                        break;
                }

                item = scanner.nextLine();
            }

            if (counterItems % 2 == 0) {

                sumPerCostumer *= 0.8;
            }

            priceTotal += sumPerCostumer;

            System.out.printf("You purchased %d items for %.2f leva.%n", counterItems, sumPerCostumer);

        }
        System.out.printf("Average bill per client is: %.2f leva.", priceTotal/costumers);
    }
}
