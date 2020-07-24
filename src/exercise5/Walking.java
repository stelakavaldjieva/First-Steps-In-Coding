package exercise5;

import java.util.Scanner;

public class Walking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sumSteps = 0;

        while (sumSteps < 10000) {

            String command = scanner.nextLine();

            if ("Going home".equals(command)) {

                int stepsToHome = Integer.parseInt(scanner.nextLine());

                sumSteps += stepsToHome;

                break;
            }

            sumSteps += Integer.parseInt(command);
        }

        if (sumSteps >= 10000) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", sumSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - sumSteps);
        }
    }
}
