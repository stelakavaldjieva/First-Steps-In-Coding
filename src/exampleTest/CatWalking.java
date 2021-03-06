package exampleTest;

import java.util.Scanner;

public class CatWalking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte minutesWalking = Byte.parseByte(scanner.nextLine());

        byte walksPerDay = Byte.parseByte(scanner.nextLine());

        short calories = Short.parseShort(scanner.nextLine());

        int caloriesBurned = minutesWalking * 5;

        int totalCaloriesBurned = caloriesBurned * walksPerDay;

        if (totalCaloriesBurned >= (calories / 2)) {

            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", totalCaloriesBurned);

        } else {

            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", totalCaloriesBurned);
        }
    }
}
