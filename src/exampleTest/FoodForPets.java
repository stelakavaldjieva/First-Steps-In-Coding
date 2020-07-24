package exampleTest;

import java.util.Scanner;

public class FoodForPets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte days = Byte.parseByte(scanner.nextLine());

        double quantityFood = Double.parseDouble(scanner.nextLine());

        int sumFoodDog = 0, sumFoodCat = 0;

        double biscuits = 0;

        for (int i = 0; i < days; i++) {

            short dogFood = Short.parseShort(scanner.nextLine());

            short catFood = Short.parseShort(scanner.nextLine());

            sumFoodDog += dogFood;

            sumFoodCat += catFood;

            int sumCurrentFood = catFood + dogFood;

            if ((i + 1) % 3 == 0) {

                biscuits += sumCurrentFood * 0.1;
            }
        }

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));

        System.out.printf("%.2f%% of the food has been eaten.%n", (sumFoodCat + sumFoodDog) / quantityFood * 100);

        System.out.printf("%.2f%% eaten from the dog.%n", sumFoodDog / (double) (sumFoodCat + sumFoodDog) * 100);

        System.out.printf("%.2f%% eaten from the cat.%n", sumFoodCat / (double) (sumFoodCat + sumFoodDog) * 100);
    }
}
