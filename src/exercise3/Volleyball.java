package exercise3;

import java.util.Scanner;

public class Volleyball {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Set year leap (366-day-long) or normal (365-day-long)
        String year = scanner.nextLine();

        short holidays = Short.parseShort(scanner.nextLine());

        short weekendsHome = Short.parseShort(scanner.nextLine());

        short weekendsSofia = (short) (48 - weekendsHome);

        float gamesWeekendsSofia = (float) (weekendsSofia * 3.0 / 4);

        // Games in hometown equals weekends in hometown [weekendsHome]

        float gamesHoliday = (float) (holidays * 2.0 / 3);

        float gamesTotal = weekendsHome + gamesWeekendsSofia + gamesHoliday;

        if ("leap".equals(year)) {
            gamesTotal = (float) Math.floor(1.15 * gamesTotal);
        } else if ("normal".equals(year)) {
            gamesTotal = (float) Math.floor(gamesTotal);
        }

        System.out.printf("%.0f", gamesTotal);
    }
}
