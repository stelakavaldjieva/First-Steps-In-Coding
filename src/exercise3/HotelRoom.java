package exercise3;

import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();

        Short nights = Short.parseShort(scanner.nextLine());

        double studio = 0.0;

        double apartment = 0.0;

        if ("May".equals(month) || "October".equals(month)) {

            if (nights <= 7) {
                studio = 50 * nights;
                apartment = 65 * nights;
            } else if (nights <= 14) {
                studio = 50 * nights * 0.95;
                apartment = 65 * nights;
            } else {
                studio = 50 * nights * 0.7;
                apartment = 65 * nights * 0.9;
            }

        } else if ("June".equals(month) || "September".equals(month)) {

            if (nights <= 14) {
                studio = 75.20 * nights;
                apartment = 68.70 * nights;
            } else {
                studio = 75.20 * nights * 0.8;
                apartment = 68.70 * nights * 0.9;
            }

        } else if ("July".equals(month) || "August".equals(month)) {

            if (nights <= 14) {
                studio = 76 * nights;
                apartment = 77 * nights;
            } else {
                studio = 76 * nights;
                apartment = 77 * nights * 0.9;
            }
        }

        System.out.printf("Apartment: %.2f lv.", apartment);
        System.out.printf("%nStudio: %.2f lv.", studio);
    }
}
