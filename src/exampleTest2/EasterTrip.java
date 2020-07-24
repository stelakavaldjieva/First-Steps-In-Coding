package exampleTest2;

import java.util.Scanner;

public class EasterTrip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        // 21-23, 24-27, 28-31;

        String dates = scanner.nextLine();

        byte nights = Byte.parseByte(scanner.nextLine());

        double pricePerNight = 0;

        if ("France".equals(destination)) {

            switch (dates) {

                case "21-23":
                    pricePerNight = 30;
                    break;

                case "24-27":
                    pricePerNight = 35;
                    break;
                case "28-31":
                    pricePerNight = 40;
                    break;
            }


        } else if ("Italy".equals(destination)) {

            switch (dates) {

                case "21-23":
                    pricePerNight = 28;
                    break;

                case "24-27":
                    pricePerNight = 32;
                    break;
                case "28-31":
                    pricePerNight = 39;
                    break;
            }
        } else if ("Germany".equals(destination)) {
            switch (dates) {


                case "21-23":
                    pricePerNight = 32;
                    break;

                case "24-27":
                    pricePerNight = 37;
                    break;
                case "28-31":
                    pricePerNight = 43;
                    break;
            }
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, nights * pricePerNight);
    }
}
