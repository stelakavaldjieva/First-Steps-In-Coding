package lecture4;

import java.util.Scanner;

public class CleverLily {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte age = Byte.parseByte(scanner.nextLine());

        double priceWashingMachine = Double.parseDouble(scanner.nextLine());

        byte priceToy = Byte.parseByte(scanner.nextLine());

        int toyQuantity = 0;

        double moneyBirthday = 0.0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 != 0)
                toyQuantity++;
            else
                moneyBirthday += (i / 2) * 10.00 - 1;
        }

        double totalMoney = priceToy * toyQuantity + moneyBirthday;

        if (priceWashingMachine > totalMoney)
            System.out.printf("No! %.2f", priceWashingMachine - totalMoney);
        else
            System.out.printf("Yes! %.2f", totalMoney - priceWashingMachine);

    }
}
