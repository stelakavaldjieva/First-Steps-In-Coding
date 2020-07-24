package lecture2;

import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vacation = Double.parseDouble(scanner.nextLine());
        short puzzle = Short.parseShort(scanner.nextLine());
        short dolls = Short.parseShort(scanner.nextLine());
        short teddyBears = Short.parseShort(scanner.nextLine());
        short minions = Short.parseShort(scanner.nextLine());
        short tracks = Short.parseShort(scanner.nextLine());

        double sum = puzzle * 2.60 + dolls * 3 + teddyBears * 4.10 + minions * 8.20 + tracks * 2;

        short toys = (short) (puzzle + dolls + teddyBears + minions + tracks);

        double discount = 0f;

        if (toys >= 50)
            discount = 0.25 * sum;

        if (vacation <= 0.9 * (sum - discount))
            System.out.printf("Yes! %.2f lv left.", 0.9 * (sum - discount) - vacation);
        else
            System.out.printf("Not enough money! %.2f lv needed.", vacation - 0.9 * (sum - discount));
    }
}