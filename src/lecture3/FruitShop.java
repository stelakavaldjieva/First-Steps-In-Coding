package lecture3;

import java.util.Scanner;

public class FruitShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();

        String day = scanner.nextLine();

        double quantity = Double.parseDouble(scanner.nextLine());

        boolean workDay = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday");

        boolean weekend = day.equals("Saturday") || day.equals("Sunday");

        double result = 0;

        if (fruit.equals("banana")) {
            if (workDay)
                result = 2.50 * quantity;
            else if (weekend)
                result = 2.70 * quantity;
        } else if (fruit.equals("apple")) {
            if (workDay)
                result = 1.20 * quantity;
            else if (weekend)
                result = 1.25 * quantity;
        } else if (fruit.equals("orange")) {
            if (workDay) {
                result = 0.85 * quantity;
            } else if (weekend) {
                result = 0.90 * quantity;
            }
        } else if (fruit.equals("grapefruit")) {
            if (workDay) {
                result = 1.45 * quantity;
            } else if (weekend) {
                result = 1.60 * quantity;
            }
        } else if (fruit.equals("kiwi")) {
            if (workDay) {
                result = 2.70 * quantity;
            } else if (weekend) {
                result = 3.00 * quantity;
            }
        } else if (fruit.equals("pineapple")) {
            if (workDay) {
                result = 5.50 * quantity;
            } else if (weekend) {
                result = 5.60 * quantity;
            }
        } else if (fruit.equals("grapes")) {
            if (workDay) {
                result = 3.85 * quantity;
            } else if (weekend) {
                result = 4.20 * quantity;
            }
        }

        if (result == 0)
            System.out.println("error");
        else
            System.out.printf("%.2f", result);

    }
}