package lecture3;

import java.util.Scanner;

public class SmallShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();

        String town = scanner.nextLine().toLowerCase();

        double quantity = Double.parseDouble(scanner.nextLine());

        if (town.equalsIgnoreCase("sofia")) {
            if (product.equals("coffee")) {
                System.out.println(0.50 * quantity);
            }
            if (product.equals("water")) {
                System.out.println(0.80 * quantity);
            }
            if (product.equals("beer")) {
                System.out.println(1.20 * quantity);
            }
            if (product.equals("sweets")) {
                System.out.println(1.45 * quantity);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.60 * quantity);
            }
        } else if (town.equalsIgnoreCase("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(0.40 * quantity);
            }
            if (product.equals("water")) {
                System.out.println(0.70 * quantity);
            }
            if (product.equals("beer")) {
                System.out.println(1.15 * quantity);
            }
            if (product.equals("sweets")) {
                System.out.println(1.30 * quantity);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.50 * quantity);
            }
        } else if (town.equalsIgnoreCase("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(0.45 * quantity);
            }
            if (product.equals("water")) {
                System.out.println(0.70 * quantity);
            }
            if (product.equals("beer")) {
                System.out.println(1.10 * quantity);
            }
            if (product.equals("sweets")) {
                System.out.println(1.35 * quantity);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.55 * quantity);
            }
        }
    }
}
