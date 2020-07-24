package exampleTest;

import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte pens = Byte.parseByte(scanner.nextLine());

        byte markers = Byte.parseByte(scanner.nextLine());

        double littersCleanser = Double.parseDouble(scanner.nextLine());

        byte discount = Byte.parseByte(scanner.nextLine());

        double totalMoney = ((pens * 5.80) + (markers * 7.20) + (littersCleanser * 1.20));

        double moneyNeeded = totalMoney - ((totalMoney * discount) / 100);

        System.out.printf("%.3f", moneyNeeded);


    }
}
