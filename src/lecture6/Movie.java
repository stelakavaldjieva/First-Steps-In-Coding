package lecture6;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Name of the movie, command "Finish" or command "End".
        String movieTitle = scanner.nextLine();

        float sitsAvailable;

        byte ticketsStudent = 0;

        byte ticketsStandard = 0;

        byte ticketsKid = 0;

        byte countTickets;

        float totalTickets = 0;

        boolean flag = false;

        while (!"Finish".equals(movieTitle)) {

            sitsAvailable = Byte.parseByte(scanner.nextLine());

            //"student", "standard", "kid"
            String typeTicket = scanner.nextLine();

            countTickets = 0;

            while (countTickets < sitsAvailable && !"End".equals(typeTicket)) {

                if (typeTicket.equals("Finish")) {
                    flag = true;
                    break;
                }
                if ("student".equals(typeTicket)) {
                    ticketsStudent++;
                    countTickets++;

                } else if ("standard".equals(typeTicket)) {
                    ticketsStandard++;
                    countTickets++;

                } else if ("kid".equals(typeTicket)) {
                    ticketsKid++;
                    countTickets++;
                }

                typeTicket = scanner.nextLine();
            }

            totalTickets += countTickets;

            float percent = countTickets / sitsAvailable * 100;

            System.out.printf("%s - %.2f%% full.%n", movieTitle, percent);

            if (flag)
                break;

            movieTitle = scanner.nextLine();
        }

        System.out.printf("Total tickets: %.0f%n", totalTickets);

        System.out.printf("%.2f%% student tickets.%n", ticketsStudent / totalTickets * 100);

        System.out.printf("%.2f%% standard tickets.%n", ticketsStandard / totalTickets * 100);

        System.out.printf("%.2f%% kids tickets.%n", ticketsKid / totalTickets * 100);
    }
}
