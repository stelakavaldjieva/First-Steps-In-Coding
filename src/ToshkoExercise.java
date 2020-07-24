import java.util.Scanner;

/**
 * Toshko does different exercises.
 * He enters an exercise name and repetitions.
 * output : sumRepetitions for every exercise.
 * output: totalRepetitions.
 */
public class ToshkoExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String exerciseType = scanner.nextLine();

        int totalRepetitions = 0;

        while (!"finish".equalsIgnoreCase(exerciseType)) {

            int sumRepetitions = 0;

            int repetitions = Integer.parseInt(scanner.nextLine());

            sumRepetitions += repetitions;

             totalRepetitions +=sumRepetitions;

            System.out.printf("Sum Repetitions for %s exercise = %d%n", exerciseType, sumRepetitions);

            exerciseType = scanner.nextLine();
        }

        System.out.printf("Total repetitions = %d", totalRepetitions);
    }
}
