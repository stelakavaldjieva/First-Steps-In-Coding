package exampleTest2;

import java.util.Scanner;

public class EasterParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte guests = Byte.parseByte(scanner.nextLine());

        double pricePerGuest = Double.parseDouble(scanner.nextLine());

        double budged = Double.parseDouble(scanner.nextLine());

        if (guests < 10) {

            pricePerGuest = pricePerGuest;

        } else if (guests >= 10 && guests <= 15) {

            pricePerGuest *= 0.85;

        } else if (guests <= 20) {

            pricePerGuest *= 0.8;

        } else {

            pricePerGuest *= 0.75;
        }

        double cakePrice = budged * 0.1;

        double priceSum = guests * pricePerGuest + cakePrice;

        if (budged >= priceSum) {

            System.out.printf("It is party time! %.2f leva left.", budged - priceSum);
        } else {

            System.out.printf("No party! %.2f leva needed.", priceSum - budged);
        }
    }
}
