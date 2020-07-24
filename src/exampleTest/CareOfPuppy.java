package exampleTest;

import java.util.Scanner;

public class CareOfPuppy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte foodQuantity = Byte.parseByte(scanner.nextLine());

        int grams = foodQuantity * 1000;

        int totalFood = 0;

        String command = scanner.nextLine();

        while (!"Adopted".equals(command)) {

            short currentFood = Short.parseShort(command);

            totalFood += currentFood;

            command = scanner.nextLine();
        }

        if (totalFood <= grams) {

            System.out.printf("Food is enough! Leftovers: %d grams.", grams - totalFood);

        } else {

            System.out.printf("Food is not enough. You need %d grams more.", totalFood - grams);
        }

    }
}
