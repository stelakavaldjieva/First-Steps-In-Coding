import java.util.Scanner;

public class MovieTickets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieTitle = scanner.nextLine();

        byte ticketsTotal = 0, ticketsKids = 0, ticketsStandard = 0, ticketsStudent = 0;

        while (!"Finish".equals(movieTitle)) {

            byte movieSeats = Byte.parseByte(scanner.nextLine());

            byte countReservedSeats = 0;

            String ticketType = "";

            while (!"End".equals(ticketType) && countReservedSeats < movieSeats) {

                ticketType = scanner.nextLine();

                if ("kid".equals(ticketType)) {

                    ticketsKids++;

                    countReservedSeats++;
                } else if ("standard".equals(ticketType)) {

                    ticketsStandard++;

                    countReservedSeats++;
                } else if ("student".equals(ticketType)) {

                    ticketsStudent++;

                    countReservedSeats++;
                }
            }

            ticketsTotal += countReservedSeats;

            System.out.printf("%s - %.2f%% full.%n", movieTitle, countReservedSeats / (float) movieSeats * 100);

            movieTitle = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", ticketsTotal);

        if (ticketsTotal == 0) {
            ticketsTotal = 1;
        }

        System.out.printf("%.2f%% student tickets.%n", ticketsStudent / (float) ticketsTotal * 100);

        System.out.printf("%.2f%% standard tickets.%n", ticketsStandard / (float) ticketsTotal * 100);

        System.out.printf("%.2f%% kids tickets.%n", ticketsKids / (float) ticketsTotal * 100);
    }
}
