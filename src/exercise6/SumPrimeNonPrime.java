package exercise6;

import java.util.Scanner;

public class SumPrimeNonPrime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int primeSum = 0;

        int nonPrimeSum = 0;

        while (!"stop".equals(command)) {

            int number = Integer.parseInt(command);

            if (number < 0) {

                System.out.println("Number is negative.");
            } else {

                boolean isPrimeNumber = true;

                for (int i = 2; i <= number / 2; ++i) {

                    if (number % i == 0) {

                        isPrimeNumber = false;

                        break;
                    }
                }

                if (isPrimeNumber)
                    primeSum += number;
                else
                    nonPrimeSum += number;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
    }
}
