package exercise4;

import java.util.Scanner;

public class OddEvenPosition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double evenMax = -1000000000.0;
        double evenMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double oddMin = 1000000000.0;

        double evenSum = 0;
        double oddSum = 0;


        for (int i = 1; i <= number; i++) {

            double element = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {

                evenSum += element;

                if (element > evenMax) {
                    evenMax = element;
                }
                if (element < evenMin) {
                    evenMin = element;
                }
            } else {

                oddSum += element;

                if (element > oddMax) {
                    oddMax = element;
                }

                if (element < oddMin) {
                    oddMin = element;
                }
            }

        }
        System.out.printf("OddSum=%.2f,", oddSum);

        if (oddMin == 1000000000.0) {
            System.out.printf("%nOddMin=No,");

        } else {
            System.out.printf("%nOddMin=%.2f,", oddMin);
        }

        if (oddMax == -1000000000.0) {
            System.out.printf("%nOddMax=No,");

        } else {
            System.out.printf("%nOddMax=%.2f,", oddMax);
        }


        System.out.printf("%nEvenSum=%.2f,", evenSum);

        if (evenMin == 1000000000.0) {
            System.out.printf("%nEvenMin=No,");

        } else {
            System.out.printf("%nEvenMin=%.2f,", evenMin);
        }

        if (evenMax == -1000000000.0) {
            System.out.printf("%nEvenMax=No");
            
        } else {
            System.out.printf("%nEvenMax=%.2f", evenMax);
        }
    }
}

