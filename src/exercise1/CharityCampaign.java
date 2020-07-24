package exercise1;

import java.util.Scanner;

public class CharityCampaign {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short days = Short.parseShort(scanner.nextLine());
        short bakers = Short.parseShort(scanner.nextLine());
        short cakes = Short.parseShort(scanner.nextLine());
        short waffles = Short.parseShort(scanner.nextLine());
        short pancakes = Short.parseShort(scanner.nextLine());

        double sumCakes = cakes * 45;
        double sumWaffles = waffles * 5.80;
        double sumPancakes = pancakes * 3.20;
        double sumPerDay = sumCakes + sumWaffles + sumPancakes;
        double wholeSum = bakers * days * sumPerDay;
        double costs = wholeSum * (1/8f);

        System.out.printf("%.2f", wholeSum - costs);
    }
}
