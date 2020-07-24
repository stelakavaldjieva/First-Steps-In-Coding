package lecture5;

import java.util.Scanner;

public class GraduationPT2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        byte counter = 1;

        double sum = 0;

        byte excluded = 0;

        while (counter <= 12) {

            float grade = Float.parseFloat(scanner.nextLine());

            if (grade < 4) {

                excluded++;

                if (excluded > 1) {
                    System.out.printf("%s has been excluded at %d grade", name, counter);
                    return;
                }

                continue;
            }

            sum += grade;

            counter++;
        }

        double average = sum / 12;

        System.out.printf("%s graduated. Average grade: %.2f", name, average);
    }
}
