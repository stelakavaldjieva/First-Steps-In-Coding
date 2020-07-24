package exercise6;

import java.util.Scanner;

public class TrainTheTrainers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int judges = Integer.parseInt(scanner.nextLine());

        String presentation = scanner.nextLine();

        int countPresentation = 0;

        double gradesSum = 0;

        // When entered 'Finish', exit program with proper output.
        while (!"Finish".equals(presentation)) {

            double presentationGradesSum = 0;

            countPresentation++;

            for (int i = 0; i < judges; i++) {

                double currentGrade = Double.parseDouble(scanner.nextLine());

                presentationGradesSum += currentGrade;
            }

            System.out.printf("%s - %.2f.%n", presentation, presentationGradesSum / judges);

            gradesSum += (presentationGradesSum / judges);

            presentation = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", gradesSum / countPresentation);
    }
}
