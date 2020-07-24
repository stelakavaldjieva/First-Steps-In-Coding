package Question6;

import java.util.Scanner;

public class BasketballTournament {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();

        int gameCounter = 0;

        int winDesy = 0;

        int winOpponent = 0;


        while (!"End of tournaments".equals(tournamentName)) {

            int currentGameCounter = 0;

            int totalGames = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= totalGames; i++) {

                gameCounter++;

                currentGameCounter++;

                int pointsDesy = Integer.parseInt(scanner.nextLine());

                int pointsOpponent = Integer.parseInt(scanner.nextLine());

                if (pointsDesy > pointsOpponent) {

                    winDesy++;

                    System.out.printf("Game %d of tournament %s: win with %d points.%n", currentGameCounter, tournamentName, pointsDesy - pointsOpponent);

                } else {

                    winOpponent++;

                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", currentGameCounter, tournamentName, pointsOpponent - pointsDesy);

                }

            }
            tournamentName = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", (float) winDesy / gameCounter * 100);
        System.out.printf("%.2f%% matches lost", (float) winOpponent / gameCounter * 100);
    }
}
