package exampleTest2;

import java.util.Scanner;

public class EasterCompetition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int breads = Integer.parseInt(scanner.nextLine());

        int maxPoints = 0;

        String winner = "";

        for (int i = 0; i < breads; i++) {

            String bakerName = scanner.nextLine();

            String bakerGrade = scanner.nextLine();

            int bakerPoints = 0;

            while (!"Stop".equals(bakerGrade)) {

                bakerPoints += Integer.parseInt(bakerGrade);

                bakerGrade = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", bakerName, bakerPoints);

            if (maxPoints < bakerPoints) {

                maxPoints = bakerPoints;

                winner = bakerName;

                System.out.printf("%s is the new number 1!%n", bakerName);
            }
        }

        System.out.printf("%s won competition with %d points!", winner, maxPoints);
    }
}
