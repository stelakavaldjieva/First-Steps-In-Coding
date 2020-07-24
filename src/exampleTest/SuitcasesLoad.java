package exampleTest;

import java.util.Scanner;

public class SuitcasesLoad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        int countSuitcases = 0;

        boolean enoughSpace = true;

        while (!"End".equals(command)) {

            double volumeSuitcase = Double.parseDouble(command);

            countSuitcases++;

            if (countSuitcases % 3 == 0) {

                volumeSuitcase *= 1.1;
            }

            if (volumeSuitcase <= capacity) {

                capacity -= volumeSuitcase;

            } else {

                enoughSpace = false;

                System.out.println("No more space!");

                break;
            }

            command = scanner.nextLine();
        }

        if (enoughSpace) {

            System.out.println("Congratulations! All suitcases are loaded!");
        } else {

            countSuitcases--;
        }

        System.out.printf("Statistic: %d suitcases loaded.", countSuitcases);
    }
}
