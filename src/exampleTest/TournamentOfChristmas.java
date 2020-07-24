package exampleTest;

import java.util.Scanner;

public class TournamentOfChristmas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte days = Byte.parseByte(scanner.nextLine());

        int totalWinCounter = 0, totalLoseCounter = 0;

        double totalMoney = 0;


        for (int i = 0; i < days; i++) {

            String sport = scanner.nextLine();

            int winCounter = 0, loseCounter = 0, currentMoney = 0;

            while (!"Finish".equals(sport)) {

                String winOrLose = scanner.nextLine();

                if ("win".equals(winOrLose)) {

                    currentMoney += 20;

                    winCounter++;

                    totalWinCounter++;

                } else if ("lose".equals(winOrLose)) {

                    loseCounter++;

                    totalLoseCounter++;
                }

                sport = scanner.nextLine();
            }
            if (winCounter > loseCounter) {

                currentMoney += currentMoney * 0.1;
            }
            totalMoney += currentMoney;
        }


        if (totalWinCounter > totalLoseCounter) {

            totalMoney += totalMoney * 0.2;

            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);

        } else {

            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
